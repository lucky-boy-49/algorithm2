package org.algorithm.simple;

import java.util.Arrays;

/**
 * 706.设计哈希映射
 * @author jiahe
 */
public class DesignHashMap {

    int[] values;
    int length = 16;
    public DesignHashMap() {
        values = new int[length];
    }

    public void put(int key, int value) {
        if(key >= length) {
            while(key >= length) {
                length *= 2;
            }
            values = Arrays.copyOf(values, length);
        }
        values[key] = value + 1;
    }

    public int get(int key) {
        if(key >= length) {
            return -1;
        }
        return values[key] - 1;
    }

    public void remove(int key) {
        if(key >= length) {
            return;
        }
        values[key] = 0;
    }

}
