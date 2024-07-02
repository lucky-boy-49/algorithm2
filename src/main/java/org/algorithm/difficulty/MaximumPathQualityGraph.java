package org.algorithm.difficulty;

import java.util.*;

/**
 * 2065. 最大化一张图中的路径价值
 *
 * @author jiahe
 */
public class MaximumPathQualityGraph {

    public int maxRes = 0;

    public int maximalPathQuality(int[] values, int[][] edges, int maxTime) {
        Map<Integer, List<int[]>> nodeEdges = new HashMap<>(values.length);
        Arrays.stream(edges).forEach(e -> {
            nodeEdges.computeIfAbsent(e[0], k -> new ArrayList<>()).add(new int[]{e[1], e[2]});
            nodeEdges.computeIfAbsent(e[1], k -> new ArrayList<>()).add(new int[]{e[0], e[2]});
        });
        int[] visited = new int[values.length];
        visited[0] = 1;
        dfs(0, nodeEdges, maxTime, values, visited, values[0], 0);
        return maxRes;
    }

    private void dfs(int index, Map<Integer, List<int[]>> nodeEdges, int maxTime, int[] values, int[] visited, int size, int time) {
        if (time > maxTime) {
            return;
        }
        if (index == 0) {
            maxRes = Math.max(maxRes, size);
        }
        if (nodeEdges.get(index) == null) {
            maxRes = Math.max(maxRes, size);
            return;
        }
        nodeEdges.get(index).forEach(node -> {
            if (visited[node[0]] == 0) {
                visited[node[0]] = 1;
                dfs(node[0], nodeEdges, maxTime, values, visited, size + values[node[0]], time + node[1]);
                visited[node[0]] = 0;
            } else {
                dfs(node[0], nodeEdges, maxTime, values, visited, size, time + node[1]);
            }
        });
    }

}
