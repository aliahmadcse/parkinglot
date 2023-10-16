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
    this.parkingAttendant.setParkingSpaces(parkingSpaces);
  }


  @Override
  public String toString()
  {
    return "";
  }


}
