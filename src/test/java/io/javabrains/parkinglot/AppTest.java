package io.javabrains.parkinglot;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class AppTest {

    @Test
    public void verifyClass() {
        try {
            Class.forName("io.javabrains.parkinglot.vehicles.CompactCar");
        } catch (ClassNotFoundException e) {
            fail("Car class not created yet");
        }
    }

}
