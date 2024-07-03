package org.algorithm.simple;

/**
 * 3099. 哈沙德数
 * 如果一个整数能够被其各个数位上的数字之和整除，则称之为 哈沙德数（Harshad number）。
 * 给你一个整数 x 。如果 x 是 哈沙德数 ，则返回 x 各个数位上的数字之和，否则，返回 -1 。
 *
 * @author jiahe
 */
public class HarshadNumber {

    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int temp = x;
        int sum = 0;
        while (temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }

}
