package org.algorithm.medium;

/**
 * 74. 搜索二维矩阵
 * 给你一个满足下述两条属性的 m x n 整数矩阵：
 * 每行中的整数从左到右按非严格递增顺序排列。
 * 每行的第一个整数大于前一行的最后一个整数。
 * 给你一个整数 target ，如果 target 在矩阵中，返回 true ；否则，返回 false 。
 *
 * @author jiahe
 */
public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        for (int[] nums : matrix) {
            if (nums[nums.length - 1] == target) {
                return true;
            }
            if (nums[nums.length - 1] > target) {
                return search(nums, target);
            }
        }
        return false;
    }

    private boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (nums[mid] == target) {
                return true;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

}
