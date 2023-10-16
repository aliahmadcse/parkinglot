package io.javabrains.parkinglot.vehicles;

public abstract class Vehicle
{

  private VehicleType vehicleType;
  private boolean isHandicapped;
  private int parkingTimeMinutes;

  public Vehicle(VehicleType vehicleType, boolean handicapped)
  {
    this.vehicleType = vehicleType;
    this.isHandicapped = handicapped;
  }

  public int getParkingTimeMinutes()
  {
    return parkingTimeMinutes;
  }

  public void setParkingTimeMinutes(int parkingTimeMinutes)
  {
    this.parkingTimeMinutes = parkingTimeMinutes;
  }

  public VehicleType getVehicleType()
  {
    return vehicleType;
  }

  public void setVehicleType(VehicleType vehicleType)
  {
    this.vehicleType = vehicleType;
  }

  public void setHandicapped(boolean handicapped)
  {
    isHandicapped = handicapped;
  }

  public boolean isHandicapped()
  {
    return isHandicapped;
  }
}
