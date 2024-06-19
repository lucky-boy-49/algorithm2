package org.algorithm.difficulty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2713. 矩阵中严格递增的单元格数
 * 给你一个下标从 1 开始、大小为 m x n 的整数矩阵 mat，你可以选择任一单元格作为 起始单元格 。
 * 从起始单元格出发，你可以移动到 同一行或同一列 中的任何其他单元格，但前提是目标单元格的值 严格大于 当前单元格的值。
 * 你可以多次重复这一过程，从一个单元格移动到另一个单元格，直到无法再进行任何移动。
 * 请你找出从某个单元开始访问矩阵所能访问的 单元格的最大数量 。
 * 返回一个表示可访问单元格最大数量的整数。
 * @author jiahe
 */
public class MaximumStrictlyIncreasingCellsMatrix {

    public int maxIncreasingCells(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        Map<Integer, List<int[]>> g = new TreeMap<>();
        // 排序二维数组
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                g.computeIfAbsent(mat[i][j], k -> new ArrayList<>()).add(new int[] {i, j});
            }
        }
        int ans = 0;
        // 每行的最大值
        int[] rowMax = new int[m];
        // 每列的最大值
        int[] colMax = new int[n];
        for (List<int[]> pos : g.values()) {
            // 先把最大值算出来，再更新 rowMax 和 colMax
            int[] mx = new int[pos.size()];
            for (int k = 0; k < pos.size(); k++) {
                int[] p = pos.get(k);
                int i = p[0];
                int j = p[1];
                mx[k] = Math.max(rowMax[i], colMax[j]) + 1;
                ans = Math.max(ans, mx[k]);
            }
            for (int k = 0; k < pos.size(); k++) {
                int[] p = pos.get(k);
                int i = p[0];
                int j = p[1];
                // 更新第 i 行的最大 f 值
                rowMax[i] = Math.max(rowMax[i], mx[k]);
                // 更新第 j 列的最大 f 值
                colMax[j] = Math.max(colMax[j], mx[k]);
            }
        }
        return ans;
    }

}
