package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertBaseTwoTest {

    @Test
    void baseNeg2() {
        ConvertBaseTwo convertBaseTwo = new ConvertBaseTwo();
        assertEquals(convertBaseTwo.baseNeg2(4), "110");
    }
}