package org.algorithm.simple;

import java.util.Arrays;

/**
 * 2864.最大二进制奇数
 */
public class MaximumOddBinaryNumber {

    public String maximumOddBinaryNumber(String s) {
        // 1 获取字符串长度
        int len = s.length();
        // 2 初始化结果数组
        int[] r = new int[len];
        // 3 遍历字符串
        // 当前所在的下标
        int i = -1;
        // 最后一位1是否找到
        boolean flag = false;
        for (int j = 0; j < len; j++) {
            char c = s.charAt(j);
            if ('1' == c) {
                if (!flag) {
                    // 3.1 找到第一个1，放置到数组的最后一位
                    r[len - 1] = 1;
                    flag = true;
                } else {
                    // 3.2 其他的1按次序从头放
                    r[++i] = 1;
                }
            }
        }
        StringBuilder result = new StringBuilder();
        Arrays.stream(r).forEach(result::append);
        return result.toString();
    }

}
