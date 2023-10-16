package io.javabrains.parkinglot.vehicles;

public class VehicleFactory
{

  public static Vehicle createVehicle(VehicleType vehicleType, boolean isHandicapped)
  {
    switch (vehicleType)
    {
      case BIKE:
        return new Bike(isHandicapped);
      case COMPACT:
        return new Compact(isHandicapped);
      case TRUCK:
        return new Truck(isHandicapped);
      case LARGE:
        return new Large(isHandicapped);
      case SUV:
        return new Suv(isHandicapped);
      default:
        throw new IllegalArgumentException(String.format("Vehicle type %s is not supported", vehicleType));
    }
  }
}
