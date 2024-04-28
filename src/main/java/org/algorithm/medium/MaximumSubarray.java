package org.algorithm.medium;

/**
 * 53. 最大子数组和
 * @author jiahe
 */
public class MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int pre = 0;
        for (int num : nums) {
            pre = Math.max(pre + num, num);
            max = Math.max(max, pre);
        }
        return max;
    }

}
