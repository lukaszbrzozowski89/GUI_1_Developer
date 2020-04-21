/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class Car extends Vehicle {


    public Car(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType) {
        super(name, area, engineCapacity, vehicleType, engineType);
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
