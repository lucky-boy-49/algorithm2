package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NqueensIITest {

    @Test
    void totalQueens() {
        NqueensII nqueensII = new NqueensII();
        assertEquals(2, nqueensII.totalNQueens(4));
    }
}