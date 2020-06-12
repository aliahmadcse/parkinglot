package io.javabrains.parkinglot.vehicles;

public class CompactCar extends Vehicle {

    public CompactCar() {
        this.vehicleType = VehicleType.COMPACT;
    }

    public String toString() {
        return "Compact";
    }
}
