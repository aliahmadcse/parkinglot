package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;
import io.javabrains.parkinglot.vehicles.VehicleType;

public class ParkingSpace {

    private ParkingSpaceType parkingSpaceType;
    private boolean isHandicapped;
    private Vehicle vehicle;

    public ParkingSpace(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }

    public ParkingSpace(ParkingSpaceType parkingSpaceType, boolean isHandicapped) {
        this.parkingSpaceType = parkingSpaceType;
        this.isHandicapped = isHandicapped;
    }

    public ParkingSpaceType getParkingSpaceType() {
        return parkingSpaceType;
    }

    public void setParkingSpaceType(ParkingSpaceType parkingSpaceType) {
        this.parkingSpaceType = parkingSpaceType;
    }

    public boolean isHandicapped() {
        return isHandicapped;
    }

    public void setHandicapped(boolean handicapped) {
        isHandicapped = handicapped;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return this.vehicle == null;
    }

    public boolean isAllowed(Vehicle vehicle) {

        if (this.isHandicapped() && !vehicle.isHandicapped()) return false;

        VehicleType vehicleType = vehicle.getVehicleType();
        switch (parkingSpaceType) {
            case TWO_WHEELER:
                return vehicleType == VehicleType.TWO_WHEELER;
            case COMPACT:
                return vehicleType == VehicleType.TWO_WHEELER || vehicleType == VehicleType.COMPACT;
            case LARGE:
                return vehicleType == VehicleType.TWO_WHEELER || vehicleType == VehicleType.COMPACT || vehicleType == VehicleType.LARGE;
            case TRUCK:
                return vehicleType == VehicleType.TWO_WHEELER || vehicleType == VehicleType.COMPACT || vehicleType == VehicleType.LARGE || vehicleType == VehicleType.TRUCK || vehicleType == VehicleType.SUV;
        }
        return false;
    }

    public boolean park(Vehicle vehicle) {
        if (!isEmpty() || !isAllowed(vehicle)) return false;
        this.vehicle = vehicle;
        return true;
    }
}
