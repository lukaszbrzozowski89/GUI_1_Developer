/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class CityCar extends Car {
    int capacity;

    public CityCar(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType, int capacity) {
        super(name, area, engineCapacity, vehicleType, engineType);
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "CityCar{" +
                "capacity=" + capacity +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
