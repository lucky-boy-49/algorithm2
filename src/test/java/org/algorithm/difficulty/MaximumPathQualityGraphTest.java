package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaximumPathQualityGraphTest {

    @Test
    void maximalPathQuality() {
        MaximumPathQualityGraph maximumPathQualityGraph = new MaximumPathQualityGraph();
        int[] values = new int[]{0, 1, 2};
        int[][] edges = new int[][]{{1, 2, 10}};
        assertEquals(75, maximumPathQualityGraph.maximalPathQuality(values, edges, 10));
    }
}