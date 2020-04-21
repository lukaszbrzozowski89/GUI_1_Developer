/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;


import java.io.Serializable;
import java.util.LinkedList;

public class Bloc implements Serializable {


    Estate estate;
    LinkedList<Apartment> apartments;
    LinkedList<Parking> parkings;

    public Bloc(LinkedList<Apartment> apartments, LinkedList<Parking> parkings, Estate estate) {
        this.apartments = apartments;
        this.parkings = parkings;
        this.estate = estate;
    }

    @Override
    public String toString() {
        return "Bloc{" +
                "apartments=" + apartments +
                ", parkings=" + parkings +
                '}';
    }
}
