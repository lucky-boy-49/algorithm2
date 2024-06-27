package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BeautifulArrangementTest {

    @Test
    void countArrangement() {
        BeautifulArrangement beautifulArrangement = new BeautifulArrangement();
        assertEquals(2, beautifulArrangement.countArrangement(2));
    }
}