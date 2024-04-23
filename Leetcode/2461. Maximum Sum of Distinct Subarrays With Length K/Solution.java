//package Leetcode.2461. Maximum Sum of Distinct Subarrays With Length K;

import java.util.HashMap;

class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Long currSum = 0l;
        Long maxSum = 0l;
        int s = 0;

        for (int e = 0; e < nums.length; e++) {
            map.put(nums[e], map.getOrDefault(nums[e], 0) + 1);
            currSum += nums[e];
            if (e - s + 1 == k) {
                if (map.size() == k)
                    maxSum = Math.max(maxSum, currSum);
                currSum -= nums[s];
                map.put(nums[s], map.get(nums[s]) - 1);
                if (map.get(nums[s]) == 0)
                    map.remove(nums[s]);
                s++;
            }
        }
        return maxSum;
    }
}
