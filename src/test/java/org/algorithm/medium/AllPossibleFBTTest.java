package org.algorithm.medium;

import org.algorithm.TreeNode;
import org.junit.jupiter.api.Test;

class AllPossibleFBTTest {

    @Test
    void allPossibleFbt() {
        AllPossibleFBT allPossibleFBT = new AllPossibleFBT();
        for (TreeNode treeNode : allPossibleFBT.allPossibleFbt(7)) {
            System.out.println(treeNode.toString());
        }

    }
}