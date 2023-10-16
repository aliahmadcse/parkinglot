package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;

import java.util.List;

public class ParkingAttendant
{

  private List<ParkingSpace> parkingSpaces;

  public List<ParkingSpace> getParkingSpaces()
  {
    return parkingSpaces;
  }

  public void setParkingSpaces(List<ParkingSpace> parkingSpaces)
  {
    this.parkingSpaces = parkingSpaces;
  }

  public boolean park(Vehicle vehicle)
  {
    return false;
  }
}
