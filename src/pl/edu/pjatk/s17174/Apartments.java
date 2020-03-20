/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

import java.util.ArrayList;

public class Apartments extends Room {

    Parking parking;
    ArrayList<Person> najemcy;


    public Apartments(double powierzchniaUzytkowa, int number) {
        super(powierzchniaUzytkowa, number);
    }
}
