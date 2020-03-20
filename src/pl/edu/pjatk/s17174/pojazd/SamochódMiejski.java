/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class SamochódMiejski extends Samochód {
    int liczbaMiejsc;
    VehicleType vehicleType;

    public SamochódMiejski(String nazwa, double polePowierzchni, double pojemnoscSilnika, Vehicle.EngineType engineType, int liczbaMiejsc) {
        super(nazwa, polePowierzchni, pojemnoscSilnika, engineType);
        this.vehicleType = VehicleType.CITY;
        this.liczbaMiejsc = liczbaMiejsc;
    }

    @Override
    public String toString() {
        return "SamochódMiejski{" +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", typNapedu=" + engineType +
                ", nazwa='" + name + '\'' +
                ", polePowierzchni=" + area +
                ", pojemnoscSilnika=" + engineCapacity +
                ", typPojazdu=" + vehicleType +
                ", typSilnika=" + engineType +
                '}';
    }
}
