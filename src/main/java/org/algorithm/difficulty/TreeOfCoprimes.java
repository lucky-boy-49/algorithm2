package org.algorithm.difficulty;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 1766.互质树
 * @author jiahe
 */
public class TreeOfCoprimes {

    private final List<Integer> parent = new LinkedList<>();
    private final Map<String, Integer> map = new HashMap<>();
    private final Map<Integer, List<Integer>> map2 = new HashMap<>();

    public int[] getCoprimes(int[] nums, int[][] edges) {

        for (int[] edge : edges) {
            if (map2.containsKey(edge[0])) {
                map2.get(edge[0]).add(edge[1]);
            } else {
                List<Integer> list = new LinkedList<>();
                list.add(edge[1]);
                map2.put(edge[0], list);
            }
            if (map2.containsKey(edge[1])) {
                map2.get(edge[1]).add(edge[0]);
            } else {
                List<Integer> list = new LinkedList<>();
                list.add(edge[0]);
                map2.put(edge[1], list);
            }
        }

        int[] ans = new int[nums.length];
        ans[0] = -1;

        parent.add(0);

        if (map2.isEmpty()) {
            return ans;
        }

        map2.get(0).forEach(n -> {
            map.put(0 + ":" + n, 1);
            map.put(n + ":" + 0, 1);
            dfs(ans, nums, edges, n);
            map.remove(0 + ":" + n);
            map.remove(n + ":" + 0);
        });

        return ans;
    }

    private void dfs(int[] ans, int[] nums, int[][] edges, int i) {
        int an = -1;
        for (Integer j : parent) {
            if (gcd(nums[j], nums[i]) == 1) {
                an = j;
            }
        }
        ans[i] = an;
        parent.add(i);
        if (map2.containsKey(i)) {
            map2.get(i).forEach(n -> {
                if (!map.containsKey(i + ":" + n)) {
                    map.put(i + ":" + n, 1);
                    map.put(n + ":" + i, 1);
                    dfs(ans, nums, edges, n);
                    map.remove(i + ":" + n);
                    map.remove(n + ":" + i);
                }
            });
        }

        parent.remove(parent.size() - 1);
    }

    private int gcd(int x, int y) {
        int max = Math.max(x, y);
        int min = Math.min(x, y);
        int r = max % min;
        while (r != 0) {
            max = min;
            min = r;
            r = max % min;
        }
        return min;
    }

}
