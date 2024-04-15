package org.algorithm.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DesignHashMapTest {

    @Test
    void test() {
        DesignHashMap hashMap = new DesignHashMap();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        assertEquals(1, hashMap.get(1));
        assertEquals(-1, hashMap.get(3));
        hashMap.put(2, 1);
        assertEquals(1, hashMap.get(2));
        hashMap.remove(2);
        assertEquals(-1, hashMap.get(2));
    }

}