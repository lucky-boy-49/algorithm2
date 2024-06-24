package org.algorithm.medium;

import org.junit.jupiter.api.Test;

class NextGreaterElementIITest {

    @Test
    void nextGreaterElements() {
        NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();
        int[] nums = {1,5,3,6,8};
        int[] result = nextGreaterElementII.nextGreaterElements(nums);
        for (int j : result) {
            System.out.println(j);
        }
    }
}