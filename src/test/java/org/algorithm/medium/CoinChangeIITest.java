package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeIITest {

    @Test
    void change() {
        assertEquals(4, new CoinChangeII().change(5, new int[]{1, 2, 5}));
    }
}