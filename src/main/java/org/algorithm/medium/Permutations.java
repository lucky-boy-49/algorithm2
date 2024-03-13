package org.algorithm.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * 46.全排列
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> r = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        // 1 获取数组大小
        int len = nums.length;
        // 2 遍历数组
        for (int i = 0; i < len; i++) {
            dfs(res, r, l, i, i, nums, len);
        }
        return res;
    }

    private void dfs(List<List<Integer>> res, List<Integer> r, List<Integer> l, int i, int j, int[] nums, int len) {
        if (r.contains(nums[i])) {
            return;
        }
        r.add(nums[i]);
        if (r.size() == len) {
            res.add(new ArrayList<>(r));
            r.remove(r.size() - 1);
        } else {
            for (int t = 1; t <= len; t++) {
                dfs(res, r, l, (i + t) % len, j, nums, len);
            }
            r.remove(r.size() - 1);
        }
    }

}
