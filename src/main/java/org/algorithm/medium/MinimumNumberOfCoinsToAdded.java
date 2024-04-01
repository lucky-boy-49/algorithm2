package org.algorithm.medium;

import java.util.Arrays;

/**
 * 2952.需要添加的硬币的最小数量
 */
public class MinimumNumberOfCoinsToAdded {

    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int ans = 0;
        int x = 1;
        int length = coins.length, index = 0;
        while (x <= target) {
            if (index < length && coins[index] <= x) {
                x += coins[index];
                index++;
            } else {
                x *= 2;
                ans++;
            }
        }
        return ans;
    }

}
