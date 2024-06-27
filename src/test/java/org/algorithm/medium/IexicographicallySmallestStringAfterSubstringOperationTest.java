package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IexicographicallySmallestStringAfterSubstringOperationTest {

    @Test
    void smallestString() {
        IexicographicallySmallestStringAfterSubstringOperation iexicographicallySmallestStringAfterSubstringOperation = new IexicographicallySmallestStringAfterSubstringOperation();
        assertEquals("baabc", iexicographicallySmallestStringAfterSubstringOperation.smallestString("cbabc"));
    }
}