/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import pl.edu.pjatk.s17174.interfaces.CheckRent;
import pl.edu.pjatk.s17174.utils.FileUtils;
import pl.edu.pjatk.s17174.utils.Timer;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;


public class Apartment extends Room implements CheckRent {


    Parking parking;
    ArrayList<Tenant> tenant = new ArrayList<>();
    private int roomNumber;
    private LocalDate dateOfStart;
    private LocalDate dateOfEnd;

    public Apartment(double useArea) {
        super(useArea);
        this.roomNumber = super.getRoomNumber();
    }


    public void addTenant(ArrayList<Tenant> tenant) {
        this.tenant.addAll(tenant);
    }

    public void addTenant(Tenant tenant) {
        this.tenant.add(tenant);

    }

    public void removeTenant(Tenant tenant) {
        this.tenant.remove(tenant);
    }

    public void removeTenant(ArrayList<Tenant> tenant) {
        this.tenant.removeAll(tenant);
    }

    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    @Override
    public String toString() {
        return "\nApartment{" +
                "parking=" + parking +
                ", tenant=" + tenant +
                ", roomNumber=" + roomNumber +
                ", dateOfStart=" + dateOfStart +
                ", dateOfEnd=" + dateOfEnd +
                '}';
    }

    @Override
    public void checkRent(ArrayList<Room> room) {
        if (Timer.getActualDate().isAfter(this.dateOfEnd)) {
            setRentStatus(Rent.RentStatus.EXPIRED);
            FileUtils file = new FileUtils(this.tenant.get(0), new File("error"));
            this.tenant.get(0).setFileCounter(this.tenant.get(0).getFileCounter() + 1);
        }
    }

    @Override
    public void remove() {
        super.remove();
        removeTenant(this.tenant);
    }
}
