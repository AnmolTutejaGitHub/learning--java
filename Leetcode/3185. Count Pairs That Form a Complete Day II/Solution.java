//package Leetcode.3185. Count Pairs That Form a Complete Day II;

import java.util.HashMap;

class Solution {
    public long countCompleteDayPairs(int[] hours) {
        HashMap<Integer, Integer> map = new HashMap<>();
        long count = 0;

        for (int i = 0; i < hours.length; i++) {
            if (map.containsKey((24 - hours[i] % 24) % 24))
                count += map.get((24 - hours[i] % 24) % 24);
            map.put(hours[i] % 24, map.getOrDefault(hours[i] % 24, 0) + 1);
        }
        return count;
    }
}
