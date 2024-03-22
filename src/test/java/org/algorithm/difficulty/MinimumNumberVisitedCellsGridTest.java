package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberVisitedCellsGridTest {
    
    @Test
    public void test() {
        MinimumNumberVisitedCellsGrid mnvcg = new MinimumNumberVisitedCellsGrid();
        assertEquals(4, mnvcg.minimumVisitedCells(new int[][]{{0, 1, 0}}));
    }

}