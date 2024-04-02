package org.algorithm.simple;

import org.algorithm.TreeNode;

/**
 * 108.将有序数组转换为二叉搜索树
 * @author jiahe
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBst(int[] nums) {
        return dfs(nums, 0, nums.length - 1);
    }

    private TreeNode dfs(int[] nums, int l, int r) {
        if (r < l) {
            return null;
        }
        int mid = l + (r - l) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = dfs(nums, l, mid - 1);
        root.right = dfs(nums, mid + 1, r);
        return root;
    }

}
