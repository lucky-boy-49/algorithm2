package org.algorithm.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GrumpyBookstoreOwnerTest {

    @Test
    void maxSatisfied() {
        GrumpyBookstoreOwner grumpyBookstoreOwner = new GrumpyBookstoreOwner();
        int[] customers = {1,0,1,2,1,1,7,5};
        int[] grumpy = {0,1,0,1,0,1,0,1};
        int X = 3;
        int result = grumpyBookstoreOwner.maxSatisfied(customers, grumpy, X);
        Assertions.assertEquals(16, result);
    }
}