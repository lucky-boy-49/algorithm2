package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {

    @Test
    void combine() {
        new Combinations().combine(4, 2).forEach(System.out::println);
    }
}