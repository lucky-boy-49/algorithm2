package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumBinaryStringAfterChangeTest {

    @Test
    void maximumBinaryString() {
        assertEquals("111011", new MaximumBinaryStringAfterChange().maximumBinaryString("000110"));
    }
}