package org.algorithm.simple;

/**
 * 2529.正整数和负整数的最大计数
 * @author jiahe
 */
public class MaximumCountOfPositiveAndNegative {

    public int maximumCount(int[] nums) {
        int pos = 0;
        int neg = 0;

        for (int num : nums) {
            if (num > 0) {
                pos++;
            } else if (num < 0) {
                neg++;
            }
        }
        
        return Math.max(pos, neg);
    }

}
