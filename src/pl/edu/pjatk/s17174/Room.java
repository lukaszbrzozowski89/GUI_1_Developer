/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;


import pl.edu.pjatk.s17174.interfaces.CheckRent;

import java.time.LocalDate;

public abstract class Room implements CheckRent {
    private static int counter = 0;
    public Rent.RentStatus rentStatus;
    private double useArea;
    private int roomNumber;
    private LocalDate dateOfEnd;

    public Room(double useArea) {
        this.useArea = useArea;
        this.roomNumber = counter++;
    }


    public LocalDate getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(LocalDate dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public double getUseArea() {
        return useArea;
    }

    public void setUseArea(double useArea) {
        this.useArea = useArea;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Rent.RentStatus getRentStatus() {
        return rentStatus;
    }

    public void setRentStatus(Rent.RentStatus rentStatus) {
        this.rentStatus = rentStatus;
    }

    @Override
    public String toString() {
        return "Room{" +
                "useArea=" + useArea +
                ", roomNumber=" + roomNumber +
                '}';
    }

    public void remove() {

    }
}
