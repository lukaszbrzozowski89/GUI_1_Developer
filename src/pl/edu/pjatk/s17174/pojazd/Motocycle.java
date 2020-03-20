/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class Motocycle extends Vehicle {
    int wheelsSize;

    public Motocycle(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType, int wheelsSize) {
        super(name, area, engineCapacity, vehicleType, engineType);
        this.wheelsSize = wheelsSize;
    }

    @Override
    public String toString() {
        return "Motocycle{" +
                "wheelsSize=" + wheelsSize +
                ", name='" + name + '\'' +
                ", area=" + area +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
