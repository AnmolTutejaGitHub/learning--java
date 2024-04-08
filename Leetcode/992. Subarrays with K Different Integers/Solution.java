//package Leetcode.992. Subarrays with K Different Integers;

import java.util.HashMap;

class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }

    public int atmost(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int s = 0;
        int count = 0;

        for (int e = 0; e < nums.length; e++) {
            map.put(nums[e], map.getOrDefault(nums[e], 0) + 1);

            while (map.size() > k) {
                map.put(nums[s], map.get(nums[s]) - 1);
                if (map.get(nums[s]) == 0)
                    map.remove(nums[s]);
                s++;
            }

            if (map.size() <= k) {
                count += e - s + 1;
            }
        }
        return count;
    }
}
