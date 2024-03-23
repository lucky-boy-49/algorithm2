package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDistinctNumbersBoardTest {

    @Test
    void distinctIntegers() {
        assertEquals(4, new CountDistinctNumbersBoard().distinctIntegers(5));
    }
}