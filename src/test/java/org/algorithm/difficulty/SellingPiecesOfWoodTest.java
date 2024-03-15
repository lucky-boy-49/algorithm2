package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

class SellingPiecesOfWoodTest {

    @Test
    void sellingWood() {
        System.out.println(new SellingPiecesOfWood().sellingWood(3, 5, new int[][]{{1, 4, 2}, {2, 2, 7}, {2, 1, 3}}));
    }
}