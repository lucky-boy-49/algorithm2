package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {

    @Test
    void permute() {
        Permutations permutations = new Permutations();
        permutations.permute(new int[] {1}).forEach(System.out::println);
    }
}