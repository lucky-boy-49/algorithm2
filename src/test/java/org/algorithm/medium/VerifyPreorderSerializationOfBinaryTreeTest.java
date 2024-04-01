package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VerifyPreorderSerializationOfBinaryTreeTest {

    @Test
    void isValidSerialization() {
        boolean res = new VerifyPreorderSerializationOfBinaryTree().isValidSerialization("9,3,4,#,#,1,#,#,2,#,6,#,#");
        assertTrue(res);
    }
}