//package Leetcode.1695. Maximum Erasure Value;

// --> means sum of max subarray containing unique element

import java.util.HashMap;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0;
        int MaxSum = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // ele,freq

        int s = 0;
        for (int e = 0; e < nums.length; e++) {
            map.put(nums[e], map.getOrDefault(nums[e], 0) + 1);
            sum += nums[e];

            while (map.size() < e - s + 1 && s < e) {
                map.put(nums[s], map.get(nums[s]) - 1);
                if (map.get(nums[s]) == 0)
                    map.remove(nums[s]);
                sum -= nums[s];
                s++;
            }

            if (map.size() == e - s + 1)
                MaxSum = Math.max(sum, MaxSum);
        }

        return MaxSum;
    }
}
