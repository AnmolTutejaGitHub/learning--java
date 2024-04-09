//package Leetcode.2799. Count Complete Subarrays in an Array;

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int ele : nums) {
            set.add(ele);
        }
        int distinct = set.size();
        return atmost(nums, distinct) - atmost(nums, distinct - 1);
    }

    public int atmost(int[] nums, int distinct) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int s = 0;
        int count = 0;
        for (int e = 0; e < nums.length; e++) {
            map.put(nums[e], map.getOrDefault(nums[e], 0) + 1);

            while (map.size() > distinct && s <= e) {
                map.put(nums[s], map.get(nums[s]) - 1);
                if (map.get(nums[s]) == 0)
                    map.remove(nums[s]);
                s++;
            }
            if (map.size() <= distinct)
                count += e - s + 1;
        }
        return count;
    }
}
