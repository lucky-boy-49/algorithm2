package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPeakElementTest {

    @Test
    void findPeakElement() {
        int[] nums = {1, 2};
        assertEquals(2, new FindPeakElement().findPeakElement(nums));
    }
}