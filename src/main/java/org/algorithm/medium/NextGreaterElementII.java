package org.algorithm.medium;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 503. 下一个更大元素 II
 * 给定一个循环数组 nums （ nums[nums.length - 1] 的下一个元素是 nums[0] ），返回 nums 中每个元素的 下一个更大元素 。
 * 数字 x 的 下一个更大的元素 是按数组遍历顺序，这个数字之后的第一个比它更大的数，这意味着你应该循环地搜索它的下一个更大的数。如果不存在，则输出 -1 。
 * @author jiahe
 */
public class NextGreaterElementII {

    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];

        Deque<Integer> q = new LinkedList<>();

        int length = nums.length;
        for (int len = length - 1; len >= 0; len--) {
            if (q.isEmpty()) {
                for (int num : nums) {
                    if (num > nums[len]) {
                        q.addFirst(num);
                        q.addFirst(nums[len]);
                        res[len] = num;
                        break;
                    }
                }
            } else {
                while (!q.isEmpty()) {
                    int num = q.pollFirst();
                    if (num > nums[len]) {
                        res[len] = num;
                        q.addFirst(num);
                        q.addFirst(nums[len]);
                        break;
                    }
                }
                if (q.isEmpty()) {
                    for (int i = 0; i < len; i++) {
                        if (nums[i] > nums[len]) {
                            res[len] = nums[i];
                            q.addFirst(nums[i]);
                            q.addFirst(nums[len]);
                            break;
                        }
                    }
                }
            }
            if (q.isEmpty()) {
                res[len] = -1;
                q.addFirst(nums[len]);
            }
        }

        return res;
    }

}
