/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;


import java.util.ArrayList;

public class Blok {

    ArrayList<Apartments> apartments;
    ArrayList<Parking> parkings;

    public Blok(ArrayList<Apartments> apartments, ArrayList<Parking> parkings) {
        this.apartments = apartments;
        this.parkings = parkings;
    }
}
