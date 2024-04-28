package org.algorithm.medium;

/**
 * 1017. 负二进制转换
 * @author jiahe
 */
public class ConvertBaseTwo {

    public String baseNeg2(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            int remainder = n & 1;
            res.append(remainder);
            n -= remainder;
            n /= -2;
        }
        return res.reverse().toString();
    }

}
