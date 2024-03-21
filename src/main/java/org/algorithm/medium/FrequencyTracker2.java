package org.algorithm.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * 2671. 频率跟踪器
 */
public class FrequencyTracker2 {

    private final Map<Integer, Integer> map1;
    private final Map<Integer, Integer> map2;

    public FrequencyTracker2() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void add(int number) {
        Integer i = map1.getOrDefault(number, 0);
        int j = i + 1;
        if (i > 0) {
            map2.put(i, map2.getOrDefault(i, 0) - 1);
        }
        map1.put(number, j);
        map2.put(j, map2.getOrDefault(j, 0) + 1);
    }

    public void deleteOne(int number) {
        Integer i = map1.getOrDefault(number, 0);
        if (i > 0) {
            int j = i - 1;
            map2.put(i, map2.get(i) - 1);
            map1.put(number, j);
            if (j > 0) {
                map2.put(j, map2.getOrDefault(j, 0) + 1);
            }
        }
    }

    public boolean hasFrequency(int frequency) {
        return map2.containsKey(frequency) && map2.get(frequency) > 0;
    }

}
