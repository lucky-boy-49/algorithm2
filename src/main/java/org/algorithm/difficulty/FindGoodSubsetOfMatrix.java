package org.algorithm.difficulty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2732. 找到矩阵中的好子集
 * 给你一个下标从 0 开始大小为 m x n 的二进制矩阵 grid 。
 * 从原矩阵中选出若干行构成一个行的 非空 子集，如果子集中任何一列的和至多为子集大小的一半，那么我们称这个子集是 好子集。
 * 更正式的，如果选出来的行子集大小（即行的数量）为 k，那么每一列的和至多为 floor(k / 2) 。
 * 请你返回一个整数数组，它包含好子集的行下标，请你将其 升序 返回。
 * 如果有多个好子集，你可以返回任意一个。如果没有好子集，请你返回一个空数组。
 * 一个矩阵 grid 的行 子集 ，是删除 grid 中某些（也可能不删除）行后，剩余行构成的元素集合。
 * @author jiahe
 */
public class FindGoodSubsetOfMatrix {

    public List<Integer> goodSubsetofBinaryMatrix(int[][] grid) {
        Map<Integer, Integer> dp = new HashMap<>(grid.length);
        for (int i = 0; i < grid.length; i++) {
            int mask = 0;
            for (int j = 0; j < grid[i].length; j++) {
                mask |= 1 << j;
            }
            if (mask == 0) {
                return List.of(i);
            }
            dp.put(mask, i);
        }
        for (Map.Entry<Integer, Integer> e1 : dp.entrySet()) {
            for (Map.Entry<Integer, Integer> e2 : dp.entrySet()) {
                if ((e1.getKey() & e2.getKey()) == 0) {
                    int i = e1.getValue();
                    int j = e2.getValue();
                    return i < j ? List.of(i, j) : List.of(j, i);
                }
            }
        }
        return List.of();
    }

}
