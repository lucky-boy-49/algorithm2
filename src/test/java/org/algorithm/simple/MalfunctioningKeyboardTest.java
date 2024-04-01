package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MalfunctioningKeyboardTest {

    @Test
    void finalString() {
        MalfunctioningKeyboard mk = new MalfunctioningKeyboard();
        String res = mk.finalString("poiinter");
        assertEquals("ponter", res);
    }
}