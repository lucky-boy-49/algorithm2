package org.algorithm.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 40.组合总和II
 * @author jiahe
 */
public class CombinationSumII {

    private int[] dp;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        dp = new int[candidates.length];
        List<Integer> list = new ArrayList<>();
        dfs(candidates, target, 0, 0, list, res);
        return res;
    }

    private void dfs(int[] candidates, int target, int i, int j, List<Integer> list, List<List<Integer>> res) {
        for (int k = j; k < candidates.length; k++) {
            if (dp[k] == 0) {
                list.add(candidates[k]);
                i += candidates[k];
                dp[k] = 1;
                if (i == target) {
                    res.add(new ArrayList<>(list));
                } else if (i < target) {
                    dfs(candidates, target, i, k, list, res);
                }
                list.remove(list.size() - 1);
                i -= candidates[k];
                dp[k] = 0;
                while (k + 1 < candidates.length && (candidates[k] == candidates[k + 1])) {
                    k++;
                }
            }
        }
    }
}
