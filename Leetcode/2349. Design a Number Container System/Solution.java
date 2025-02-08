//package Leetcode.2349. Design a Number Container System;

import java.util.HashMap;
import java.util.TreeSet;

class NumberContainers {
    HashMap<Integer, Integer> map; // index,number
    HashMap<Integer, TreeSet<Integer>> map2; // number , pq-index

    public NumberContainers() {
        map = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {
            int num = map.get(index);
            map2.get(num).remove(index);
        }
        map.put(index, number);
        TreeSet<Integer> pq = map2.getOrDefault(number, new TreeSet<Integer>());
        pq.add(index);
        map2.put(number, pq);
    }

    public int find(int number) {
        if (!map2.containsKey(number) || map2.get(number).isEmpty()) {
            return -1;
        }

        TreeSet<Integer> pq = map2.get(number);
        return pq.first();
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */