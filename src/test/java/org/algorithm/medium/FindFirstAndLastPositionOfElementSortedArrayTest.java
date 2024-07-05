package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class FindFirstAndLastPositionOfElementSortedArrayTest {

    @Test
    void searchRange() {
        FindFirstAndLastPositionOfElementSortedArray findFirstAndLastPositionOfElementSortedArray = new FindFirstAndLastPositionOfElementSortedArray();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;
        int[] res = findFirstAndLastPositionOfElementSortedArray.searchRange(nums, target);
        assertArrayEquals(new int[]{3, 4}, res);
    }

}