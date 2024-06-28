//package Leetcode.2285. Maximum Total Importance of Roads;

import java.util.*;

class Solution {
    public long maximumImportance(int n, int[][] roads) {
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(map.get(b), map.get(a)));

        for (int i = 0; i < roads.length; i++) {
            map.put(roads[i][0], map.getOrDefault(roads[i][0], 0) + 1);
            map.put(roads[i][1], map.getOrDefault(roads[i][1], 0) + 1);
        }
        pq.addAll(map.keySet());

        long count = n;
        long sum = 0;

        while (!pq.isEmpty()) {
            sum += map.get(pq.peek()) * count;
            count--;
            pq.poll();
        }

        return sum;
    }
}