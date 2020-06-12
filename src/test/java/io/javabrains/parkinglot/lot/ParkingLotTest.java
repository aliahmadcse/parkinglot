package io.javabrains.parkinglot.lot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class ParkingLotTest {
    @Test
    public void verifyClass() {
        try {
            Class.forName("io.javabrains.parkinglot.vehicles.CompactCar");
        } catch (ClassNotFoundException e) {
            fail("Car class not created yet");
        }
    }
}
