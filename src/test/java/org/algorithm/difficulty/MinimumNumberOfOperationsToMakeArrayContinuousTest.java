package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfOperationsToMakeArrayContinuousTest {

    @Test
    void minOperations() {
        MinimumNumberOfOperationsToMakeArrayContinuous arrayContinuous = new MinimumNumberOfOperationsToMakeArrayContinuous();
        assertEquals(1, arrayContinuous.minOperations(new int[] {1,2,3,5,6}));
    }
}