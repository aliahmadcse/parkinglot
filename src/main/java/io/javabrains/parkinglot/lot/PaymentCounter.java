package io.javabrains.parkinglot.lot;

public class PaymentCounter
{

  private long totalCash;

  public long getTotalCash()
  {
    return totalCash;
  }

  public void pay(int amount)
  {
    totalCash += amount;
  }

  public int calculateCost(int minutes)
  {
    int cost = 0;
    while (minutes >= 1440)
    {
      cost += 500;
      minutes -= 1440;
    }

    if (minutes > 180)
    {
      cost += minutes;
    }

    if (minutes <= 180)
    {
      cost += minutes * 2;
    }

    return cost;
  }
}
