package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RangeSumQueryImmutableTest {

    @Test
    public void test() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable.NumArray rangeSumQueryImmutable = new RangeSumQueryImmutable.NumArray(nums);
        assertEquals(1, rangeSumQueryImmutable.sumRange(0, 2));
        assertEquals(-1, rangeSumQueryImmutable.sumRange(2, 5));
        assertEquals(-3, rangeSumQueryImmutable.sumRange(0, 5));
    }

    @Test
    public void test2() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        RangeSumQueryImmutable.NumArray2 rangeSumQueryImmutable = new RangeSumQueryImmutable.NumArray2(nums);
        assertEquals(1, rangeSumQueryImmutable.sumRange(0, 2));
        assertEquals(-1, rangeSumQueryImmutable.sumRange(2, 5));
        assertEquals(-3, rangeSumQueryImmutable.sumRange(0, 5));
    }

}