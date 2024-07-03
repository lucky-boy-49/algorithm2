package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumPrimeDifferenceTest {

    @Test
    void maximumPrimeDifference() {
        int[] nums = {4, 2, 9, 5, 3};
        assertEquals(3, new MaximumPrimeDifference().maximumPrimeDifference(nums));
    }
}