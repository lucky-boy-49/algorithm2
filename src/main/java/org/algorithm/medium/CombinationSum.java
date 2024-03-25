package org.algorithm.medium;

import java.util.LinkedList;
import java.util.List;

/**
 * 39.组合总和
 * @author 贺佳
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        List<Integer>  list = new LinkedList<>();
        dfs(result, list, candidates, target, 0, 0);
        return result;
    }

    private void dfs(List<List<Integer>> result, List<Integer> list, int[] candidates, int target, int i, int j) {
        for (int k = j; k < candidates.length; k++) {
            list.add(candidates[k]);
            i += candidates[k];
            if (i == target) {
                result.add(new LinkedList<>(list));
                list.remove(list.size() - 1);
                i -= candidates[k];
            } else if (i > target) {
                list.remove(list.size() - 1);
                i -= candidates[k];
            } else {
                dfs(result, list, candidates, target, i, k);
                list.remove(list.size() - 1);
                i -= candidates[k];
            }
        }
    }

}
