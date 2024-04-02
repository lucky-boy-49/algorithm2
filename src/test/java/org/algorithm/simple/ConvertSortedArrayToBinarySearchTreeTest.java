package org.algorithm.simple;

import org.algorithm.TreeNode;
import org.junit.jupiter.api.Test;

class ConvertSortedArrayToBinarySearchTreeTest {

    @Test
    void sortedArrayToBST() {
        ConvertSortedArrayToBinarySearchTree searchTree = new ConvertSortedArrayToBinarySearchTree();
        TreeNode res = searchTree.sortedArrayToBst(new int[]{-10,-3,0,5,9});
        System.out.println(res.toString());
    }
}