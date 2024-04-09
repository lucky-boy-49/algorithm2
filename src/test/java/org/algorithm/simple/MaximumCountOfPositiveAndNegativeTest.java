package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumCountOfPositiveAndNegativeTest {

    @Test
    void maximumCount() {
        assertEquals(3, new MaximumCountOfPositiveAndNegative().maximumCount(new int[]{-2,-1,-1,1,2,3}));
    }
}