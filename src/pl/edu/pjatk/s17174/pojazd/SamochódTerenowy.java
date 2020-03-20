/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class SamochódTerenowy extends Samochód {
    double wielkoscKol;
    VehicleType vehicleType;

    public SamochódTerenowy(String nazwa, double polePowierzchni, double pojemnoscSilnika, EngineType typNapedu, double wielkoscKol) {
        super(nazwa, polePowierzchni, pojemnoscSilnika, typNapedu);
        this.vehicleType = VehicleType.OFFROAD;
        this.wielkoscKol = wielkoscKol;
    }

    @Override
    public String toString() {
        return "SamochódTerenowy{" +
                "wielkoscKol=" + wielkoscKol +
                ", typNapedu=" + engineType +
                ", nazwa='" + name + '\'' +
                ", polePowierzchni=" + area +
                ", pojemnoscSilnika=" + engineCapacity +
                ", typPojazdu=" + vehicleType +
                ", typSilnika=" + engineType +
                '}';
    }
}
