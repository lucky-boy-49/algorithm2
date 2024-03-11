package org.algorithm.difficulty;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    @Test
    void calculate() {
        BasicCalculator bc = new BasicCalculator();
        System.out.println(bc.calculate("(1+(4+5+2)-3)+(6+8)"));
    }
}