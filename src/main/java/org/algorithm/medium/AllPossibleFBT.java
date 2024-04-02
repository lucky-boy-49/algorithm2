package org.algorithm.medium;

import org.algorithm.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 894.所有可能的真二叉树
 * @author jiahe
 */
public class AllPossibleFBT {

    public List<TreeNode> allPossibleFbt(int n) {
        if (n == 1) {
            List<TreeNode> res = new LinkedList<>();
            res.add(new TreeNode(1));
            return res;
        }
        if (n == 3) {
            List<TreeNode> res = new LinkedList<>();
            TreeNode root = new TreeNode(1);
            root.left = new TreeNode(1);
            root.right = new TreeNode(1);
            res.add(root);
            return res;
        }
        List<TreeNode> res = new LinkedList<>();
        for (int i = 1; i < n; i += 2) {
            List<TreeNode> list1 = allPossibleFbt(i);
            List<TreeNode> list2 = allPossibleFbt(n - i -1);
            for (TreeNode treeNode1 : list1) {
                for (TreeNode treeNode2 : list2) {
                    TreeNode treeNode = new TreeNode(1);
                    treeNode.left = treeNode1;
                    treeNode.right = treeNode2;
                    res.add(treeNode);
                }
            }
        }
        return res;
    }

}
