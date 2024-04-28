package org.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaximumSubarrayTest {

        @Test
        public void testMaxSubArray_EmptyArray() {
            int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
            MaximumSubarray maximumSubarray = new MaximumSubarray();
            int result = maximumSubarray.maxSubArray(nums);
            Assertions.assertEquals(6, result);
        }

}