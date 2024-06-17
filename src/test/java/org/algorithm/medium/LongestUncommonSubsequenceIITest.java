package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestUncommonSubsequenceIITest {

    @Test
    void findLusLength() {
        LongestUncommonSubsequenceII longestUncommonSubsequenceII = new LongestUncommonSubsequenceII();
        assertEquals(3, longestUncommonSubsequenceII.findLusLength(new String[]{"aba", "cdc", "eae"}));
        assertEquals(-1, longestUncommonSubsequenceII.findLusLength(new String[]{"aaa", "aaa", "aa"}));
    }
}