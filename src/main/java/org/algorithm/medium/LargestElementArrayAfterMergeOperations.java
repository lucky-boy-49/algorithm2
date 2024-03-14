package org.algorithm.medium;

/**
 * 2789. 合并后数组中的最大元素
 */
public class LargestElementArrayAfterMergeOperations {

    public long maxArrayValue(int[] nums) {
        long sum = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            sum = nums[i] <= sum ? nums[i] + sum : nums[i];
        }
        return sum;
    }

}
