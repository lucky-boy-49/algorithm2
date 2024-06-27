package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SpecialPermutationsTest {

    @Test
    void specialPerm() {
        int res = new SpecialPermutations().specialPerm(new int[]{20, 100, 50, 5, 10, 70, 7});
        assertEquals(48, res);
    }
}