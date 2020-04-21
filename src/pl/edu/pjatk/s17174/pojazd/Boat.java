/*
 * Copyright (c) Brzozowski Łukasz@PJATK : s17174
 */

package pl.edu.pjatk.s17174.pojazd;

import java.time.LocalDate;

public class Boat extends Vehicle {
    LocalDate endOfApproval;

    public Boat(String name, double area, double engineCapacity, VehicleType vehicleType, EngineType engineType, LocalDate endOfApproval) {
        super(name, area, engineCapacity, vehicleType, engineType);
        this.endOfApproval = endOfApproval;
    }

    public Boat(String name, double area, double engineCapacity, EngineType engineType, LocalDate endOfApproval) {
        super(name, area, engineCapacity, engineType);
        this.endOfApproval = endOfApproval;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "endOfApproval=" + endOfApproval +
                ", engineCapacity=" + engineCapacity +
                ", vehicleType=" + vehicleType +
                ", engineType=" + engineType +
                '}';
    }
}
