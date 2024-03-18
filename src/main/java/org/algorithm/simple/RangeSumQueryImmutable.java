package org.algorithm.simple;

/**
 * 303. 区域和检索 - 数组不可变
 * @author 贺佳
 */
public class RangeSumQueryImmutable {

    static class NumArray {

        private final int[] sums;

        public NumArray(int[] nums) {
            this.sums = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right ; i++) {
                sum += sums[i];
            }
            return sum;
        }
    }

    static class NumArray2 {

        int[] sum;

        public NumArray2(int[] nums) {
            int len = nums.length;
            sum = new int[len];
            sum[0] = nums[0];
            for (int i = 1; i < len; i++) {
                sum[i] = sum[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            if (left == 0) {
                return sum[right];
            }
            return sum[right] - sum[left - 1];
        }
    }

}
