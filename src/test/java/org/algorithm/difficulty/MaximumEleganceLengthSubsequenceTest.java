package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumEleganceLengthSubsequenceTest {

    @Test
    void findMaximumElegance() {
        MaximumEleganceLengthSubsequence subsequence = new MaximumEleganceLengthSubsequence();
        long res = subsequence.findMaximumElegance(new int[][]{{3, 1}, {3, 1}, {2, 2}, {5, 3}}, 3);
        assertEquals(19, res);
    }
}