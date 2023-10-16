package io.javabrains.parkinglot.lot;

import io.javabrains.parkinglot.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot
{

  private List<ParkingSpace> parkingSpaces = new ArrayList<>();
  private PaymentCounter paymentCounter = new PaymentCounter();
  private final ParkingAttendant parkingAttendant;

  public ParkingLot()
  {
    this.parkingAttendant = new ParkingAttendant();
  }

  public ParkingAttendant getParkingAttendant()
  {
    return parkingAttendant;
  }

  public PaymentCounter getPaymentCounter()
  {
    return paymentCounter;
  }

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
    boolean parked = parkingAttendant.park(vehicle, parkingSpaces);
    if (parked)
    {
      int cost = paymentCounter.calculateCost(vehicle.getParkingTimeMinutes());
      paymentCounter.pay(cost);
    }
    return parked;
  }



  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();

    for (ParkingSpace parkingSpace : parkingSpaces)
    {
      if (parkingSpace.getVehicle() == null)
      {
        sb.append("(").append(parkingSpace.getParkingSpaceType().name().charAt(0)).append(")");
        sb.append("|______|").append("      ");
      }
      else
      {
        sb.append("(").append(parkingSpace.getParkingSpaceType().name().charAt(0)).append(")");
        sb.append("|__").append(parkingSpace.getVehicle().getVehicleType().name()).append("__|").append("      ");
      }
    }

    return sb.toString();
  }


}
