//package Leetcode.2364.Count Number of Bad Pairs;

import java.util.HashMap;

class Solution {
    public long countBadPairs(int[] nums) {
        long nonBad = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = i - nums[i];
            if (map.containsKey(key)) {
                nonBad += map.get(key);
            }
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        int n = nums.length;
        return (long) n * (n - 1) / 2 - nonBad;
    }
}