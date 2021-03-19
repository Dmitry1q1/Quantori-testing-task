package com.mit.sosnilo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuantoriTestingTaskTest {

    QuantoriTestingTask quantoriTestingTask = new QuantoriTestingTask();

    @Test(expected = IllegalArgumentException.class)
    public void testNullCase() {
        quantoriTestingTask.sumDigits(null);
    }

    @Test
    public void testEmptyCase() {
        assertEquals(0, quantoriTestingTask.sumDigits(""));
    }

    @Test
    public void testNotNullAndNotEmptyValuesCase() {
        assertEquals(6, quantoriTestingTask.sumDigits("aa1bc2d3"));
        assertEquals(8, quantoriTestingTask.sumDigits("aa11b33"));
        assertEquals(0, quantoriTestingTask.sumDigits("Chocolate"));
    }
}
