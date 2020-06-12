package io.javabrains.parkinglot.vehicles;

public class Truck extends Vehicle {
    public Truck() {
        this.vehicleType = VehicleType.TRUCK;
    }

    public String toString() {
        return "Truck";
    }
}
