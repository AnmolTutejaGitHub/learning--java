//package Leetcode.2404. Most Frequent Even Element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int freq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    freq++;
            }
            map.put(nums[i], freq);
        }

        int maxfreq = Integer.MIN_VALUE;
        int ans = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (key % 2 == 0 && value >= maxfreq) {
                if (value == maxfreq && key < ans) {
                    ans = key;
                } else if (value == maxfreq)
                    continue;
                maxfreq = value;
                ans = key;
            }

        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
