package org.algorithm.medium;

/**
 * 1702.修改后的最大二进制字符串
 * @author 贺佳
 */
public class MaximumBinaryStringAfterChange {

    public String maximumBinaryString(String binary) {
        int c0 = 0, c1 = 0, n = binary.length();
        for (char c : binary.toCharArray()) {
            c0 += '1' - c;
            c1 += c0 > 0 ? c - '0' : 0;
        }
        return c0 < 2 ? binary : "1".repeat(n - c1 - 1) + '0' + "1".repeat(c1);
    }

}
