/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class Samochód extends Vehicle {
    EngineType engineType;

    public Samochód(String name, double area, double engineCapacity, EngineType engineType) {
        super(name, area, engineCapacity, engineType);
    }


    @Override
    public String toString() {
        return "Samochód{" +
                "typNapedu=" + engineType +
                ", nazwa='" + name + '\'' +
                ", polePowierzchni=" + area +
                ", pojemnoscSilnika=" + engineCapacity +
                ", typPojazdu=" + vehicleType +
                ", typSilnika=" + engineType +
                '}';
    }

}
