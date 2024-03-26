package org.algorithm.difficulty;

import java.util.Arrays;

/**
 * 2642.设计可以求最短路径的图类
 * @author jiahe
 */
public class Graph {

    private final int[][] dist;

    private final int n;

    private final int MAX = (int) 1e8;

    public Graph(int n, int[][] edges) {
        dist = new int[n][n];
        this.n = n;
        Arrays.stream(dist).forEach(a -> Arrays.fill(a, MAX));
        for (int i = 0; i < n; i++) {
            dist[i][i] = 0;
        }
        Arrays.stream(edges).forEach(a -> dist[a[0]][a[1]] = a[2]);
        floyd();
    }

    public void addEdge(int[] edge) {
        if (edge[2] >= dist[edge[0]][edge[1]]) {
            return;
        }
        dist[edge[0]][edge[1]] = edge[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = Math.min(dist[i][j], Math.min(dist[i][edge[0]] + edge[2] + dist[edge[1]][j], MAX));
            }
        }
    }

    public int shortestPath(int node1, int node2) {
        return dist[node1][node2] >= MAX ? -1 : dist[node1][node2];
    }

    private void floyd() {
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dist[i][j] = Math.min(dist[i][j], Math.min(dist[i][k] + dist[k][j], MAX));
                }
            }
        }
    }

}
