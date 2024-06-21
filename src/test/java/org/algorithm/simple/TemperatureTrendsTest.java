package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTrendsTest {

    @Test
    void temperatureTrend() {
        TemperatureTrends trends = new TemperatureTrends();
        int[] a = new int[] {5,10,16,-6,15,11,3};
        int[] b = new int[] {16,22,23,23,25,3,-16};
        assertEquals(3, trends.temperatureTrend(a, b));
    }
}