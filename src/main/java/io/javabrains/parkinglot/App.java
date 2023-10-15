package io.javabrains.parkinglot;

import io.javabrains.parkinglot.lot.ParkingLot;
import io.javabrains.parkinglot.lot.ParkingSpace;
import io.javabrains.parkinglot.lot.ParkingSpaceType;
import io.javabrains.parkinglot.vehicles.VehicleFactory;
import io.javabrains.parkinglot.vehicles.VehicleType;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();
        parkingLot.setParkingSpaces(
            Arrays.asList(
                    new ParkingSpace(ParkingSpaceType.COMPACT, true),
                    new ParkingSpace(ParkingSpaceType.LARGE, false),
                    new ParkingSpace(ParkingSpaceType.TRUCK, true),
                    new ParkingSpace(ParkingSpaceType.BIKE, true)
            )
        );

        parkingLot.getParkingAttendant().park(VehicleFactory.createVehicle(VehicleType.BIKE, false));
        parkingLot.getParkingAttendant().park(VehicleFactory.createVehicle(VehicleType.COMPACT, false));
        parkingLot.getParkingAttendant().park(VehicleFactory.createVehicle(VehicleType.SUV, true));
        parkingLot.getParkingAttendant().park(VehicleFactory.createVehicle(VehicleType.COMPACT, true));
        parkingLot.getParkingAttendant().park(VehicleFactory.createVehicle(VehicleType.LARGE, false));

        System.out.println(parkingLot);
    }
}
