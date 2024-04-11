package org.algorithm.medium;

import org.algorithm.Node;

/**
 * 427. 建立四叉树
 * @author jiahe
 */
public class ConstructQuadTree {

    public Node construct(int[][] grid) {
        return dfs(0, grid.length - 1, 0, grid[0].length - 1, grid);
    }

    private Node dfs(int rowT, int rowB, int colL, int colR, int[][] grid) {
        if (rowB - rowT == 1 && colR - colL == 1) {
            if (grid[rowT][colL] == grid[rowT][colR] && grid[rowT][colR] == grid[rowB][colR]
                    && grid[rowB][colR] == grid[rowB][colL]) {
                return new Node(grid[colL][rowT] == 1, true, null, null, null, null);
            } else {
                Node node = new Node(true, false);
                node.topLeft = new Node(grid[rowT][colL] == 1, true);
                node.topRight = new Node(grid[rowT][colR] == 1, true);
                node.bottomLeft = new Node(grid[rowB][colL] == 1, true);
                node.bottomRight = new Node(grid[rowB][colR] == 1, true);
                return node;
            }
        } else {
            int midRow = (rowT + rowB) / 2;
            int midCol = (colL + colR) / 2;
            Node topLeft = dfs(rowT, midRow, colL, midCol, grid);
            Node topRight = dfs(rowT, midRow, midCol + 1, colR, grid);
            Node bottomLeft = dfs(midRow + 1, rowB, colL, midCol, grid);
            Node bottomRight = dfs(midRow + 1, rowB, midCol + 1, colR, grid);
            if (topLeft.val == topRight.val && topRight.val == bottomLeft.val && bottomLeft.val == bottomRight.val) {
                return new Node(topLeft.val, true, null, null, null, null);
            } else {
                Node node = new Node(true, false);
                node.topLeft = topLeft;
                node.topRight = topRight;
                node.bottomLeft = bottomLeft;
                node.bottomRight = bottomRight;
                return node;
            }
        }
    }

}
