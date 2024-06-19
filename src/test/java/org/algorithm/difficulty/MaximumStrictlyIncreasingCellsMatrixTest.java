package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumStrictlyIncreasingCellsMatrixTest {

    @Test
    void maxIncreasingCells() {
        int[][] mat = new int[][] {{3, 1, 6}, {-9, 5, 7}};
        MaximumStrictlyIncreasingCellsMatrix matrix = new MaximumStrictlyIncreasingCellsMatrix();
        assertEquals(4, matrix.maxIncreasingCells(mat));
    }
}