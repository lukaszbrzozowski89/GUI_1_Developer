/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.ArrayList;


public class Rent {
    private static ArrayList<Room> listOfRents = new ArrayList<>();

    public static ArrayList<Room> getListOfRents() {
        return listOfRents;
    }


    public static void addToListOfRents(Apartment room) {
        getListOfRents().add(room);
    }

    public static void addToListOfRents(Parking room) {
        getListOfRents().add(room);
    }


    public enum RentStatus {
        VALID, CANCELLED, EXPIRED, RENEWED
    }
}
