package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HarshadNumberTest {

    @Test
    void sumOfTheDigitsOfHarshadNumber() {
        assertEquals(9, new HarshadNumber().sumOfTheDigitsOfHarshadNumber(18));
    }
}