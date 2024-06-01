//package Leetcode.594. Longest Harmonious Subsequence;

import java.util.Arrays;

class Solution {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);
        int maxLen = 0;
        int s = 0;

        for (int e = 0; e < nums.length; e++) {
            while (nums[e] - nums[s] > 1) {
                s++;
            }

            if (nums[e] - nums[s] == 1)
                maxLen = Math.max(maxLen, e - s + 1);
        }

        return maxLen;
    }
}