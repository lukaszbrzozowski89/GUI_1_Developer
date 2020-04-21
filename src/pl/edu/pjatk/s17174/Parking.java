/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import pl.edu.pjatk.s17174.interfaces.CheckRent;
import pl.edu.pjatk.s17174.utils.Timer;

import java.time.LocalDate;
import java.util.ArrayList;


public class Parking extends Room implements CheckRent {

    private LocalDate dateOfStart;
    private Person rentOwner;
    private LocalDate dateOfEnd;
    private ArrayList<Item> listOfItems = new ArrayList<>();
    private Tenant tenant;
    private int roomNumber;


    public Parking(double useArea, Tenant tenant) {
        super(useArea);
        this.tenant = tenant;
        this.roomNumber = super.getRoomNumber();
    }

    public ArrayList<Item> getListOfItems() {
        return listOfItems;
    }

    public void setListOfItems(ArrayList<Item> listOfItems) {
        this.listOfItems = listOfItems;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    @Override
    public Rent.RentStatus getRentStatus() {
        return super.getRentStatus();
    }

    @Override
    public void setRentStatus(Rent.RentStatus rentStatus) {
        super.setRentStatus(rentStatus);
    }

    @Override
    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public void checkRent(ArrayList<Room> room) {
        if (Timer.getActualDate().isAfter(this.getDateOfEnd())) {
            setRentStatus(Rent.RentStatus.EXPIRED);
        }
    }

    @Override
    public String toString() {
        return "Parking{" +
                "LocalDateOfStart=" + dateOfStart +
                ", LocalDateOfEnd=" + dateOfEnd +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public Person getRentOwner() {
        return rentOwner;
    }

    public void setRentOwner(Person rentOwner) {
        this.rentOwner = rentOwner;
    }

    @Override
    public void remove() {
        super.remove();
        getListOfItems().clear();
    }
}
