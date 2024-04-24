package org.algorithm.medium;

import org.algorithm.TreeNode;

/**
 * 2385. 感染二叉树需要的总时间
 * @author jiahe
 */
public class AmountOfTimeForBinaryTreeInfected {
    private int ans;

    public int amountOfTime(TreeNode root, int start) {
        dfs(root, start);
        return ans;
    }

    private int dfs(TreeNode node, int start) {
        if (node == null) {
            return 0;
        }
        int lLen = dfs(node.left, start);
        int rLen = dfs(node.right, start);
        if (node.val == start) {
            // 计算子树 start 的最大深度
            // 负负得正
            ans = -Math.min(lLen, rLen);
            // 用正数表示找到了 start
            return 1;
        }
        if (lLen > 0 || rLen > 0) {
            // 只有在左子树或右子树包含 start 时，才能更新答案
            // 两条链拼成直径
            ans = Math.max(ans, Math.abs(lLen) + Math.abs(rLen));
            // max 会自动取到正数
            return Math.max(lLen, rLen) + 1;
        }
        // 用负数表示没有找到 start
        return Math.min(lLen, rLen) - 1;
    }
}
