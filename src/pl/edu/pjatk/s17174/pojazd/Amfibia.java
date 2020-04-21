/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public class Amfibia extends Vehicle {

    double displacement; // wypornosc

    public Amfibia(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType, double displacement) {
        super(name, area, engineCapacity, vehicleType, engineType);
        this.displacement = displacement;
    }

    public Amfibia(String name, double area, double engineCapacity, EngineType engineType, double displacement) {
        super(name, area, engineCapacity, engineType);
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Amfibia{" +
                "displacement=" + displacement +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
