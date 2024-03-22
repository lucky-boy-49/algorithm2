package org.algorithm.difficulty;

/**
 * 2617. 网格图中最少访问的格子数
 * @author HeJia
 */
public class MinimumNumberVisitedCellsGrid {
    
    public int minimumVisitedCells(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int v = grid[i][j];
                if (dp[i][j] == 0 || dp[i][j] == Integer.MAX_VALUE) {
                    dp[i][j] = Integer.MAX_VALUE;
                    continue;
                }
                int sum = dp[i][j] + 1;
                for (int k = 1; k <= v; k++) {
                    int newJ = j + k;
                    if (newJ < n) {
                        dp[i][newJ] = dp[i][newJ] == 0 ? sum : Math.min(dp[i][newJ], sum);
                        if (i == m - 1 && newJ == n - 1) {
                            return dp[i][newJ];
                        }
                    }
                    int newI = i + k;
                    if (newI < m) {
                        dp[newI][j] = dp[newI][j] == 0 ? sum : Math.min(dp[newI][j], sum);
                        if (newI == m - 1 && j == n - 1) {
                            return dp[newI][j];
                        }
                    }
                }
            }
        }
        return dp[m - 1][n - 1] == Integer.MAX_VALUE ? -1 : dp[m - 1][n - 1];
    }

}