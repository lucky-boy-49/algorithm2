package org.algorithm.medium;

/**
 * 2684. 矩阵中移动的最大次数
 * @author 贺佳
 */
public class MaximumNumberMovesGrid {

    public int maxMoves(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            res = Math.max(res, dfs(grid, i, 0, 0, dp));
        }
        return res;
    }

    private int dfs(int[][] grid, int i, int j, int moves, int[][] dp) {
        int max = moves;
        if (dp[i][j] == 0) {
            if (i - 1 >= 0 && j + 1 < grid[0].length && grid[i][j] < grid[i - 1][j + 1]) {
                max = Math.max(max, dfs(grid, i - 1, j + 1, moves + 1, dp));
            }
            if (j + 1 < grid[0].length && grid[i][j] < grid[i][j + 1]) {
                max = Math.max(max, dfs(grid, i, j + 1, moves + 1, dp));
            }
            if (i + 1 < grid.length && j + 1 < grid[0].length && grid[i][j] < grid[i + 1][j + 1]) {
                max = Math.max(max, dfs(grid, i + 1, j + 1, moves + 1, dp));
            }
            dp[i][j] = max;
        } else {
            max = dp[i][j];
        }

        return max;
    }

}
