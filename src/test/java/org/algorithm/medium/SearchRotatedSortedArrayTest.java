package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchRotatedSortedArrayTest {

    @Test
    void search() {
        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        int[] nums = {1, 3, 5};
        int target = 5;
        int result = searchRotatedSortedArray.search(nums, target);
        assertEquals(1, result);
    }
}