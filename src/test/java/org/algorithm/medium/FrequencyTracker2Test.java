package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTracker2Test {

    @Test
    public void test(){
        FrequencyTracker2 ft = new FrequencyTracker2();
        ft.deleteOne(1);
        ft.add(3);
        assertTrue(ft.hasFrequency(1));
    }

}