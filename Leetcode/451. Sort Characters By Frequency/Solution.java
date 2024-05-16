// package Leetcode.451. Sort Characters By Frequency;

import java.util.*;

class Solution {
    public String frequencySort(String s) {
        PriorityQueue<String[]> pq = new PriorityQueue<>(com);
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            String[] pair = { String.valueOf(s.charAt(i)), String.valueOf(map.get(s.charAt(i))) };
            pq.add(pair);
        }

        StringBuilder res = new StringBuilder();
        while (!pq.isEmpty()) {
            String[] ans = pq.poll();
            res.append(ans[0]);
        }

        return res.toString();
    }

    Comparator<String[]> com = new Comparator<>() {
        public int compare(String[] pair1, String[] pair2) {
            int logic = Integer.compare(Integer.parseInt(pair2[1]), Integer.parseInt(pair1[1]));
            if (logic == 0) {
                return Character.compare(pair1[0].charAt(0), pair2[0].charAt(0));
            }
            return logic;
        }
    };
}
