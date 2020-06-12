package io.javabrains.parkinglot.vehicles;

public class VehicleFactory {

    public static Vehicle createVehicle(VehicleType vehicleType, boolean isHandicapped) {
        Vehicle vehicle;
        switch (vehicleType) {

            case LARGE: vehicle = new LargeCar(); break;
            case SUV: vehicle = new Suv(); break;
            case TRUCK: vehicle = new Truck(); break;
            case TWO_WHEELER: vehicle = new TwoWheeler(); break;
            case COMPACT:
            default: vehicle = new CompactCar(); break;
        }
        vehicle.setHandicapped(isHandicapped);
        return vehicle;
    }
}
