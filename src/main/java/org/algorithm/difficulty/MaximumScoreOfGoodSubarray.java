package org.algorithm.difficulty;

/**
 * 1793. 好子数组的最大分数
 * @auther 贺佳
 */
public class MaximumScoreOfGoodSubarray {
    
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int left = k - 1, right = k + 1;
        int ans = 0;
        for (int i = nums[k];;) {
            while (left >= 0 && nums[left] >= i) {
                --left;
            }
            while (right < n && nums[right] >= i) {
                ++right;
            }
            ans = Math.max(ans, (right - left - 1) * i);
            if (left == -1 && right == n) {
                break;
            }
            i = Math.max((left == -1 ? -1 : nums[left]), (right == n ? -1 : nums[right]));
            if (i == -1) {
                break;
            }
        }
        return ans;
    }
    
}