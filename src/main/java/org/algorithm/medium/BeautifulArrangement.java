package org.algorithm.medium;

import java.util.Arrays;

/**
 * 526. 优美的排列<br>
 * 假设有从 1 到 n 的 n 个整数。用这些整数构造一个数组 perm（下标从 1 开始），只要满足下述条件 之一 ，该数组就是一个 优美的排列 ：<br>
 * perm[i] 能够被 i 整除<br>
 * i 能够被 perm[i] 整除<br>
 * 给你一个整数 n ，返回可以构造的 优美排列 的 数量 。<br>
 * @author jiahe
 */
public class BeautifulArrangement {

    public int countArrangement(int n) {
        int[] memo = new int[1 << n];
        // -1 表示没有计算过
        Arrays.fill(memo, -1);
        return dfs(0, n, memo);
    }

    private int dfs(int s, int n, int[] memo) {
        if (s == (1 << n) - 1) {
            return 1;
        }
        // 之前计算过
        if (memo[s] != -1) {
            return memo[s];
        }
        int res = 0;
        int i = Integer.bitCount(s) + 1;
        for (int j = 1; j <= n; j++) {
            if ((s >> (j - 1) & 1) == 0 && (i % j == 0 || j % i == 0)) {
                res += dfs(s | (1 << (j - 1)), n, memo);
            }
        }
        // 记忆化
        memo[s] = res;
        return res;
    }

}
