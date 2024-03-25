package org.algorithm.medium;

/**
 * 518.零钱兑换 II
 * @author jiahe
 */
public class CoinChangeII {

    public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }

}
