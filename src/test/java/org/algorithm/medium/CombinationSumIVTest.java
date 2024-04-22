package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumIVTest {

    @Test
    void combinationSum4() {
        CombinationSumIV combinationSumIV = new CombinationSumIV();
        int[] nums = {1, 2, 3};
        int target = 4;
        int result = combinationSumIV.combinationSum4(nums, target);
        assertEquals(7, result);
    }
}