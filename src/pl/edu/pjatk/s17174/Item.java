/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174;

public class Item {

    String name;
    double area;

    public Item(String name, double area) {
        this.name = name;
        this.area = area;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
