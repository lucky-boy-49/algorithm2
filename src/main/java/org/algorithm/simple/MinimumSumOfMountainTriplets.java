package org.algorithm.simple;

/**
 * 2908.元素和最小的山形三元数组1
 * @author jiahe
 */
public class MinimumSumOfMountainTriplets {

    public int minimumSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] < nums[j] && nums[k] < nums[j]) {
                        int sum = nums[i] + nums[j] + nums[k];
                        min = Math.min(min, sum);
                    }
                }
            }
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }

    public int minimumSumTwo(int[] nums) {
        int n = nums.length, res = 1000, mn = 1000;
        int[] left = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = mn = Math.min(nums[i - 1], mn);
        }

        int right = nums[n - 1];
        for (int i = n - 2; i > 0; i--) {
            if (left[i] < nums[i] && nums[i] > right) {
                res = Math.min(res, left[i] + nums[i] + right);
            }
            right = Math.min(right, nums[i]);
        }

        return res < 1000 ? res : -1;
    }

}
