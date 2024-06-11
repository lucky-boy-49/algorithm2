package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleshipsBoardTest {

    @Test
    void countBattleships() {
        BattleshipsBoard battleshipsBoard = new BattleshipsBoard();
        char[][] board = new char[][]{{'X', '.', '.', 'X'}, {'.', '.', '.', 'X'}, {'.', '.', '.', 'X'}};
        int result = battleshipsBoard.countBattleships(board);
        assertEquals(2, result);
    }
}