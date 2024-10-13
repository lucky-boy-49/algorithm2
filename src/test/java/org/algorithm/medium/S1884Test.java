package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class S1884Test {

    @Test
    void twoEggDrop() {
        S1884 s1884 = new S1884();
        assertEquals(2, s1884.twoEggDrop(2));
        assertEquals(14, s1884.twoEggDrop2(100));
    }
}