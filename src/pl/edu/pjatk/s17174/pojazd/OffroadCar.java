/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class OffroadCar extends Car {
    double wheelSize;

    public OffroadCar(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType, double wheelSize) {
        super(name, area, engineCapacity, vehicleType, engineType);
        this.wheelSize = wheelSize;
    }

    @Override
    public String toString() {
        return "OffroadCar{" +
                "wheelSize=" + wheelSize +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
