/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

import pl.edu.pjatk.s17174.Item;

public abstract class Vehicle extends Item {

    double engineCapacity;
    VehicleType vehicleType;
    EngineType engineType;

    public Vehicle(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType) {
        super(name, area);
        this.engineCapacity = engineCapacity;
        this.vehicleType = vehicleType;
        this.engineType = engineType;
    }

    public Vehicle(String name, double area, double engineCapacity, EngineType engineType) {
        super(name, area);
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }

    public enum VehicleType {
        CITY, OFFROAD, SPORT

    }

    public enum EngineType {
        GASOLINE, DIESEL, HYBRID, ELECTRIC
    }
}
