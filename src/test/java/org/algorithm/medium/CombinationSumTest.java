package org.algorithm.medium;

import org.junit.jupiter.api.Test;

class CombinationSumTest {

    @Test
    void combinationSum() {
        int[] candidates = {8, 7, 4, 3};
        int target = 11;
        CombinationSum combinationSum = new CombinationSum();
        combinationSum.combinationSum(candidates, target).forEach(System.out::println);
    }
}