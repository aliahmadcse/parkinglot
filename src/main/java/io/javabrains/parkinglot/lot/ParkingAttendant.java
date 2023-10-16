package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;
import io.javabrains.parkinglot.vehicles.VehicleType;

import java.util.List;

public class ParkingAttendant
{

  public boolean park(Vehicle vehicle, List<ParkingSpace> parkingSpaces)
  {
    for (ParkingSpace parkingSpace : parkingSpaces)
    {
      if (isParkingAllowed(parkingSpace, vehicle) && parkSpace(parkingSpace, vehicle))
      {
        return true;
      }
    }

    return false;
  }

  private boolean isParkingAllowed(ParkingSpace parkingSpace, Vehicle vehicle)
  {
    if (parkingSpace.getVehicle() != null)
    {
      return false;
    }

//    a non-handicapped permitted vehicle can't be parked in a handicapped parking space
    if (parkingSpace.isHandicapped() && !vehicle.isHandicapped())
    {
      return false;
    }

    return true;
  }

  private boolean parkSpace(ParkingSpace parkingSpace, Vehicle vehicle)
  {
    if (parkingSpace.getParkingSpaceType() == ParkingSpaceType.BIKE && vehicle.getVehicleType() == VehicleType.BIKE)
    {
      parkingSpace.setVehicle(vehicle);
      return true;
    }

    if (parkingSpace.getParkingSpaceType() == ParkingSpaceType.COMPACT &&
            (vehicle.getVehicleType() == VehicleType.COMPACT || vehicle.getVehicleType() == VehicleType.BIKE))
    {
      parkingSpace.setVehicle(vehicle);
      return true;
    }

    if (parkingSpace.getParkingSpaceType() == ParkingSpaceType.LARGE &&
            (vehicle.getVehicleType() == VehicleType.LARGE || vehicle.getVehicleType() == VehicleType.COMPACT
                     || vehicle.getVehicleType() == VehicleType.BIKE))
    {
      parkingSpace.setVehicle(vehicle);
      return true;
    }

    if (parkingSpace.getParkingSpaceType() == ParkingSpaceType.TRUCK &&
            (vehicle.getVehicleType() == VehicleType.TRUCK || vehicle.getVehicleType() == VehicleType.LARGE
                     || vehicle.getVehicleType() == VehicleType.COMPACT || vehicle.getVehicleType() == VehicleType.BIKE
                     || vehicle.getVehicleType() == VehicleType.SUV))
    {
      parkingSpace.setVehicle(vehicle);
      return true;
    }

    return false;
  }
}
