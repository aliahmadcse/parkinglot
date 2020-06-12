package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParkingLot {

    List<ParkingSpace> parkingSpaces = new ArrayList<>();

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

    public void setParkingSpaces(List<ParkingSpace> parkingSpaces) {
        this.parkingSpaces = parkingSpaces;
    }


    public boolean park(Vehicle vehicle) {
        for (ParkingSpace parkingSpace : parkingSpaces) {
            if (parkingSpace.isEmpty() && parkingSpace.isAllowed(vehicle)) {
                parkingSpace.park(vehicle);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (ParkingSpace parkingSpace : parkingSpaces) {
            char initial = parkingSpace.getParkingSpaceType().name().charAt(0);
            if (parkingSpace.isEmpty()) {
                result.append("(").append(initial).append(")|______|    ");
            } else {
                result.append("(").append(initial).append(")|__").append(parkingSpace.getVehicle().getVehicleType()).append("__|    ");
            }
        }
        return result.toString();
    }


}
