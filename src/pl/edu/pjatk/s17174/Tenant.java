/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import pl.edu.pjatk.s17174.exceptions.ItemDontExistsException;
import pl.edu.pjatk.s17174.exceptions.ProblematicTenantException;
import pl.edu.pjatk.s17174.exceptions.TooManyThingsException;
import pl.edu.pjatk.s17174.interfaces.ItemAction;
import pl.edu.pjatk.s17174.interfaces.RentAction;
import pl.edu.pjatk.s17174.utils.Timer;

import java.io.File;
import java.time.LocalDate;

public class Tenant extends Person implements RentAction, ItemAction {

    boolean isMainTenant;
    private boolean wantToRentParking;
    private File file;
    private int fileCounter;

    public Tenant(int uniqueId, String name, String surname, String PESEL, Address address, LocalDate birthLocalDate, boolean isMainTenant) {
        super(uniqueId, name, surname, PESEL, address, birthLocalDate);
        this.isMainTenant = isMainTenant;
    }

    public boolean isMainTenant() {
        return isMainTenant;
    }

    public void setMainTenant(boolean mainTenant) {
        isMainTenant = mainTenant;
    }

    @Override
    public int getCountOfLiabilities() {
        return super.getCountOfLiabilities();
    }

    @Override
    public void setCountOfLiabilities(int countOfLiabilities) {
        super.setCountOfLiabilities(countOfLiabilities);
    }

    @Override
    public void putItem(Item item, Parking parking) throws TooManyThingsException {
        if (item.area < parking.getUseArea()) {
            parking.setUseArea(parking.getUseArea() - item.area);
            parking.getListOfItems().add(item);
            System.out.println(item.name + " włozony, zostało jeszcze " + parking.getUseArea() + " objetosci");
        } else
            throw new TooManyThingsException("Remove some old items to insert a new item");
    }

    @Override
    public void takeOutItem(String name, Parking parking) throws ItemDontExistsException {
        Item item = getItem(name, parking);
        if (item != null) {
            parking.setUseArea(parking.getUseArea() - item.area);
            parking.getListOfItems().remove(item);
            System.out.println(item.name + " wyjety");
        } else
            throw new ItemDontExistsException("Podany przedmiot nie jest w tym parkingu");
    }

    public Item getItem(String name, Parking parking) {
        Item result = null;
        for (Item item : parking.getListOfItems()) {
            if (!item.name.equalsIgnoreCase(name)) {
                result = item;
            }
        }
        return result;
    }

    @Override
    public void rent(Apartment apartment, int days) throws ProblematicTenantException {
        if (this.getCountOfLiabilities() < 3 || this.getListOfRooms().size() == 5) {
            if (this.isMainTenant()) {
                apartment.addTenant(this);
                apartment.setDateOfStart(Timer.getActualDate());
                apartment.setDateOfEnd(Timer.getActualDate().plusDays(days));
                apartment.setRentStatus(Rent.RentStatus.VALID);
                Rent.addToListOfRents(apartment);
                if (this.isWantToRentParking()) {
                    rent(new Parking(34, this), 30);
                }
            } else {
                System.out.println("Tylko główna osoba moze wynajac apartament");
            }
        } else
            throw new ProblematicTenantException("Osoba " + this + " posiadała już najem pomieszczeń:" + this.getListOfRooms());
    }

    @Override
    public void rent(Parking parking, int days) throws ProblematicTenantException {
        if (this.getCountOfLiabilities() < 3 || this.getListOfRooms().size() == 5) {
            if (this.isMainTenant()) {
                parking.setRentOwner(this);
                parking.setDateOfStart(Timer.getActualDate());
                parking.setDateOfEnd(Timer.getActualDate().plusDays(days));
                parking.setRentStatus(Rent.RentStatus.VALID);
                Rent.addToListOfRents(parking);
            } else {
                System.out.println("Tylko główna osoba moze wynajac parking");
            }
        } else
            throw new ProblematicTenantException("Osoba " + this + " posiadała już najem pomieszczeń:" + this.getListOfRooms());
    }

    @Override
    public void checkOut(Apartment apartment, Tenant tenant) {
        apartment.removeTenant(tenant);
    }

    @Override
    public void checkIn(Apartment apartment, Tenant tenant) {
        apartment.addTenant(tenant);
    }


    @Override
    public void renewRent(Room room, LocalDate renewDate) {
        if (room.getRentStatus() == Rent.RentStatus.VALID || room.getRentStatus() == Rent.RentStatus.EXPIRED) {
            room.setDateOfEnd(renewDate);
            room.setRentStatus(Rent.RentStatus.RENEWED);
//            file.delete();
            fileCounter--;
        }
    }

    public boolean isWantToRentParking() {
        return wantToRentParking;
    }

    public void setWantToRentParking(boolean wantToRentParking) {
        this.wantToRentParking = wantToRentParking;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public int getFileCounter() {
        return fileCounter;
    }

    public void setFileCounter(int fileCounter) {
        this.fileCounter = fileCounter;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTenant{" +
                "isMainTenant=" + isMainTenant +
                ", wantToRentParking=" + wantToRentParking +
                ", file=" + file +
                ", fileCounter=" + fileCounter +
                '}';
    }
}
