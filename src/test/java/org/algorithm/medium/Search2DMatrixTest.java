package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Search2DMatrixTest {

    @Test
    void searchMatrix() {
        int[][] ints = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        assertTrue(new Search2DMatrix().searchMatrix(ints, 3));
    }
}