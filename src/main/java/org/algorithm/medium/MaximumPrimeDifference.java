package org.algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 3115. 质数的最大距离
 * 给你一个整数数组 nums。
 * 返回两个（不一定不同的）质数在 nums 中 下标 的 最大距离。
 *
 * @author jiahe
 */
public class MaximumPrimeDifference {

    public int maximumPrimeDifference(int[] nums) {
        /*
         * 100以内的质数
         * 2、3、5、7、11、13、17、19、23、29、31、37、41、43、47、53、59、61、67、71、73、79、83、89、97
         */
        Map<Integer, Integer> map = new HashMap<>();
        map.put(2, 2);
        map.put(3, 3);
        map.put(5, 5);
        map.put(7, 7);
        map.put(11, 11);
        map.put(13, 13);
        map.put(17, 17);
        map.put(19, 19);
        map.put(23, 23);
        map.put(29, 29);
        map.put(31, 31);
        map.put(37, 37);
        map.put(41, 41);
        map.put(43, 43);
        map.put(47, 47);
        map.put(53, 53);
        map.put(59, 59);
        map.put(61, 61);
        map.put(67, 67);
        map.put(71, 71);
        map.put(73, 73);
        map.put(79, 79);
        map.put(83, 83);
        map.put(89, 89);
        map.put(97, 97);
        int left = -1, right = -1;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && left == -1) {
                left = i;
            }
            if (map.containsKey(nums[nums.length - 1 - i]) && right == -1) {
                right = nums.length - 1 - i;
            }
            if (left != -1 && right != -1) {
                return right - left;
            }
        }
        return 0;
    }

}
