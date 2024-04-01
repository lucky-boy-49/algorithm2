package org.algorithm.medium;

/**
 * 79.单词搜索
 * @author jiahe
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        boolean res = false;

        int[][] flag = new int[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, word, board, flag, 0, word.length() -1)) {
                        return true;
                    }
                    flag[i][j] = 0;
                }
            }
        }

        return res;
    }

    private boolean dfs(int i, int j, String word, char[][] board, int[][] flag, int index, int len) {
        if (index == len && flag[i][j] == 0 && board[i][j] == word.charAt(index)) {
            return true;
        }
        boolean res = false;
        flag[i][j] = 1;
        if (i - 1 >= 0 && flag[i - 1][j] == 0 && board[i - 1][j] == word.charAt(index + 1)) {
            res = dfs(i - 1, j, word, board, flag, index + 1, len);
            flag[i - 1][j] = 0;
        }
        if (i + 1 < board.length && flag[i + 1][j] == 0 && board[i + 1][j] == word.charAt(index + 1)) {
            res = res || dfs(i + 1, j, word, board, flag, index + 1, len);
            flag[i + 1][j] = 0;
        }
        if (j - 1 >= 0 && flag[i][j - 1] == 0 && board[i][j - 1] == word.charAt(index + 1)) {
            res = res || dfs(i , j - 1, word, board, flag, index + 1, len);
            flag[i][j - 1] = 0;
        }
        if (j + 1 < board[0].length && flag[i][j + 1] == 0 && board[i][j + 1] == word.charAt(index + 1)) {
            res = res || dfs(i , j + 1, word, board, flag, index + 1, len);
            flag[i][j + 1] = 0;
        }
        return res;
    }

}
