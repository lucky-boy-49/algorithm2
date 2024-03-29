package org.algorithm.medium;

/**
 * 1997.访问完所有房间的第一天
 * @author 贺佳
 */
public class FirstDayBeenInAllRooms {

    public int firstDayBeenInAllRooms(int[] nextVisit) {
        int mod = 1000000007;
        int len = nextVisit.length;
        int[] dp = new int[len];
        // 初始化原地待一天 + 访问下一个房间一天
        dp[0] = 2;
        for (int i = 1; i < len; i++) {
            int to = nextVisit[i];
            dp[i] = 2 + dp[i - 1];
            if (to != 0) {
                // 避免负数
                dp[i] = (dp[i] - dp[to - 1] + mod) % mod;
            }

            dp[i] = (dp[i] + dp[i - 1]) % mod;
        }
        // 题目保证n >= 2
        return dp[len - 2];
    }

}
