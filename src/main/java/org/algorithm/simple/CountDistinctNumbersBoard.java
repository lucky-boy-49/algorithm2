package org.algorithm.simple;

/**
 * 2549. 统计桌面上的不同数字
 * @author 贺佳
 */
public class CountDistinctNumbersBoard {

    public int distinctIntegers(int n) {
        if (n == 1) {
            return 1;
        }
        return n - 1;
    }

}
