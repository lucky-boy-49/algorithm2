package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    @Test
    public void test() {
        Graph graph = new Graph(4, new int[][]{{0, 2, 5}, {0, 1, 2}, {1, 2, 1}, {3, 0, 3}});
        assertEquals(6, graph.shortestPath(3, 2));
        assertEquals(-1, graph.shortestPath(0, 3));
        graph.addEdge(new int[]{1, 3, 4});
        assertEquals(6, graph.shortestPath(0, 3));
    }

}