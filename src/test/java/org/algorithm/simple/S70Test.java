package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S70Test {

    @Test
    void climbStairs() {
        S70 s70 = new S70();
        assertEquals(5, s70.climbStairs(4));
    }
}