package org.algorithm.medium;

import org.algorithm.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AllPossibleFBTTest {

    @Test
    void allPossibleFbt() {
        AllPossibleFBT allPossibleFBT = new AllPossibleFBT();
        for (TreeNode treeNode : allPossibleFBT.allPossibleFbt(7)) {
            System.out.println(treeNode.toString());
        }

    }
}