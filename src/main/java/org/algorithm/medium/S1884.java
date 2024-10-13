package org.algorithm.medium;

import java.util.Arrays;

/**
 * @author 贺佳
 */
public class S1884 {
    public int twoEggDrop(int n) {
        int i = 1;
        int res = 0;
        while (n >= 1) {
            n -= i++;
            res++;
        }
        return res;
    }
    public int twoEggDrop2(int n) {
        int[] res = new int[n + 1];
        Arrays.fill(res, Integer.MAX_VALUE / 2);
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                res[i] = Math.min(res[i], Math.max(j - 1, res[i - j]) + 1);
            }
        }
        return res[n];
    }
}
