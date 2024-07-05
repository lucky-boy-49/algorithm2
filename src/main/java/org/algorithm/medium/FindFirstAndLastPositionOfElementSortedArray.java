package org.algorithm.medium;

/**
 * 34. 在排序数组中查找元素的第一个和最后一个位置
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 *
 * @author jiahe
 */
public class FindFirstAndLastPositionOfElementSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        int index = -1, left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                index = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (index == -1) {
            return res;
        }
        left = index;
        while (left >= 0 && nums[left] == target) {
            left--;
        }
        right = index;
        while (right < nums.length && nums[right] == target) {
            right++;
        }
        res[0] = left + 1;
        res[1] = right - 1;
        return res;
    }

}
