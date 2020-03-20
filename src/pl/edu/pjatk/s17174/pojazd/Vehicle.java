/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

public abstract class Vehicle {

    String name;
    double area;
    double engineCapacity;
    VehicleType vehicleType;
    EngineType engineType;

    public Vehicle(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType) {
        this.name = name;
        this.area = area;
        this.engineCapacity = engineCapacity;
        this.vehicleType = vehicleType;
        this.engineType = engineType;
    }

    public Vehicle(String name, double area, double engineCapacity, EngineType engineType) {
        this.name = name;
        this.area = area;
        this.engineCapacity = engineCapacity;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", area=" + area +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }

    public enum VehicleType {
        CITY, OFFROAD, SPORT;

    }

    public enum EngineType {
        GASOLINE, DIESEL, HYBRID, ELECTRIC
    }
}
