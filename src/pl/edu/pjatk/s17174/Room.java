/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

public class Room {

    private double powierzchniaUzytkowa;

    private int number;

    public Room(double powierzchniaUzytkowa, int number) {
        this.powierzchniaUzytkowa = powierzchniaUzytkowa;
        this.number = number;
    }

    public double getPowierzchniaUzytkowa() {
        return powierzchniaUzytkowa;
    }

    public void setPowierzchniaUzytkowa(double powierzchniaUzytkowa) {
        this.powierzchniaUzytkowa = powierzchniaUzytkowa;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
