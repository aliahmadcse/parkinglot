package io.javabrains.parkinglot.vehicles;

public abstract class Vehicle {

    VehicleType vehicleType;
    private boolean isHandicapped;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setHandicapped(boolean handicapped) {
        isHandicapped = handicapped;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }
}
