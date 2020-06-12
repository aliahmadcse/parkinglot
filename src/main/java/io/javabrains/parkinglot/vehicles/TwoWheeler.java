package io.javabrains.parkinglot.vehicles;

public class TwoWheeler extends Vehicle{
    public TwoWheeler() {
        this.vehicleType = VehicleType.TWO_WHEELER;
    }

    public String toString() {
        return "Bike";
    }
}
