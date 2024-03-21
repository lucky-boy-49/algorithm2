package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTrackerTest {

    @Test
    public void test(){
        FrequencyTracker ft = new FrequencyTracker();
        ft.deleteOne(1);
        ft.add(3);
        assertTrue(ft.hasFrequency(1));
    }

}