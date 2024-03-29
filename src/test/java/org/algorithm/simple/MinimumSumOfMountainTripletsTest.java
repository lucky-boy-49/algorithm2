package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSumOfMountainTripletsTest {

    @Test
    void minimumSum() {
        MinimumSumOfMountainTriplets min = new MinimumSumOfMountainTriplets();
        assertEquals(9, min.minimumSum(new int[]{8, 6, 1, 5, 3}));
    }

    @Test
    void minimumSumTwo() {
        MinimumSumOfMountainTriplets min = new MinimumSumOfMountainTriplets();
        assertEquals(9, min.minimumSumTwo(new int[]{8, 6, 1, 5, 3}));
    }
}