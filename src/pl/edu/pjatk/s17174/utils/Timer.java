/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.utils;


import pl.edu.pjatk.s17174.Rent;
import pl.edu.pjatk.s17174.Room;
import pl.edu.pjatk.s17174.interfaces.CheckRent;

import java.time.LocalDate;
import java.util.ArrayList;

public class Timer extends Thread implements CheckRent {


    protected static LocalDate actualTime = LocalDate.now();
    int counter = 0;

    public static LocalDate getActualDate() {
        return actualTime;
    }

    public static void setActualTime(LocalDate actualTime) {
        Timer.actualTime = actualTime;
    }

    public void run() {

        while (true) {
            try {
                sleep(5000);
                if (counter % 2 == 0) {
                    checkRent(Rent.getListOfRents());
                }
                counter++;
            } catch (InterruptedException exc) {
                exc.getStackTrace();
                return;
            }
            setActualTime(actualTime.plusDays(1));

        }
    }

    @Override
    public void checkRent(ArrayList<Room> listOfRents) {
        for (Room room : listOfRents) {
            if (room.getDateOfEnd().isAfter(getActualDate()) && room.getRentStatus().equals(Rent.RentStatus.VALID)) {
                room.setRentStatus(Rent.RentStatus.EXPIRED);
                System.out.println(" Pomieszczenie : " + room + "skonczyl sie najem");
            }
            if (room.getDateOfEnd().isAfter(room.getDateOfEnd().plusDays(30)) && room.getRentStatus().equals(Rent.RentStatus.EXPIRED)) {
                room.remove();
            }
        }
    }
}