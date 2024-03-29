package org.algorithm.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {

    @Test
    void generateParenthesis() {
        GenerateParentheses gp = new GenerateParentheses();
        gp.generateParenthesis(3).forEach(System.out::println);
    }
}