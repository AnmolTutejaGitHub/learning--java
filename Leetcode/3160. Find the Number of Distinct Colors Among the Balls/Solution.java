// package Leetcode.3160. Find the Number of Distinct Colors Among the Balls;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer, HashSet<Integer>> mapColorToBalls = new HashMap<>();
        HashMap<Integer, Integer> latestColorOfBall = new HashMap<>();

        int[] arr = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int color = queries[i][1];
            int ball = queries[i][0];
            if (latestColorOfBall.containsKey(ball)) {
                int color_ = latestColorOfBall.get(ball);
                HashSet<Integer> list = mapColorToBalls.get(color_);
                list.remove(queries[i][0]);
                if (list.size() == 0)
                    mapColorToBalls.remove(color_);
            }

            HashSet<Integer> ls = mapColorToBalls.getOrDefault(queries[i][1], new HashSet<Integer>());
            ls.add(ball);
            mapColorToBalls.put(color, ls);
            latestColorOfBall.put(ball, color);
            arr[i] = mapColorToBalls.size();
        }
        return arr;
    }
}