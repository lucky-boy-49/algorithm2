package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    @Test
    void exist() {
        WordSearch wordSearch = new WordSearch();
        boolean res = wordSearch.exist(new char[][]{{'a', 'b'}}, "ba");
        assertTrue(res);
    }
}