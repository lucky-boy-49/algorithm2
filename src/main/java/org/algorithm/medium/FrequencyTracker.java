package org.algorithm.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2671. 频率跟踪器
 */
public class FrequencyTracker {

    private final Map<Integer, Integer> map1;
    private final Map<Integer, List<Integer>> map2;

    public FrequencyTracker() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void add(int number) {
        if (map1.containsKey(number)) {
            Integer i = map1.get(number);
            int j = i + 1;
            map1.put(number, j);
            if (map2.containsKey(j)) {
                map2.get(j).add(number);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(number);
                map2.put(j, list);
            }
            map2.get(i).remove(Integer.valueOf(number));
            if (map2.get(i).isEmpty()) {
                map2.remove(i);
            }
        } else {
            map1.put(number, 1);
            if (map2.containsKey(1)) {
                map2.get(1).add(number);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(number);
                map2.put(1, list);
            }
        }
    }

    public void deleteOne(int number) {
        if (map1.containsKey(number)) {
            Integer i = map1.get(number);
            int j = i - 1;
            if (j <= 0) {
                map1.remove(number);
                map2.get(i).remove(Integer.valueOf(number));
            } else {
                map1.put(number, j);
                map2.get(i).remove(Integer.valueOf(number));
                if (map2.containsKey(j)) {
                    map2.get(j).add(number);
                } else {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(number);
                    map2.put(j, list);
                }
            }
            if (map2.get(i).isEmpty()) {
                map2.remove(i);
            }
        }
    }

    public boolean hasFrequency(int frequency) {
        return map2.containsKey(frequency);
    }

}
