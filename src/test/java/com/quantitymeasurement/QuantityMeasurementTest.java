package com.quantitymeasurement;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Objects;

public class QuantityMeasurementTest {
    private QuantityMeasurement object;

    @Before
    public void QuantityMeasurement() {
        object = new QuantityMeasurement();
    }


    @Test
    public void givenTwoUnit_IfEqual_ShouldReturnTrue() {
        boolean result = object.calculatingMeasurements(0, 0);
        Assert.assertTrue(result);
    }

    @Test
    public void givenObject_IfNotNull_ShouldReturnFalse() {
        boolean result = object.equals(null);
        Assert.assertFalse(result);
    }
}
