/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

import java.util.Date;

public class Łódź extends Vehicle {
    Date koniecHomologacji;

    public Łódź(String nazwa, double polePowierzchni, double pojemnoscSilnika, VehicleType vehicleType, EngineType engineType, Date koniecHomologacji) {
        super(nazwa, polePowierzchni, pojemnoscSilnika, vehicleType, engineType);
        this.koniecHomologacji = koniecHomologacji;
    }

    @Override
    public String toString() {
        return "Łódź{" +
                "koniecHomologacji=" + koniecHomologacji +
                ", nazwa='" + name + '\'' +
                ", polePowierzchni=" + area +
                ", pojemnoscSilnika=" + engineCapacity +
                ", typPojazdu=" + vehicleType +
                ", typSilnika=" + engineType +
                '}';
    }
}
