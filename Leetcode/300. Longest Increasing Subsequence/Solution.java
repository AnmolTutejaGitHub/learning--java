// package Leetcode.300. Longest Increasing Subsequence;
// https://leetcode.com/problems/longest-increasing-subsequence/description/

import java.util.Arrays;

class Solution {
    public int lengthOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        int res = 0;
        Arrays.fill(dp,1);
        for(int i=0;i<nums.length;i++){
            int max = 0;
            for(int j=0;j<i;j++){
                if(nums[j]<nums[i]) max = Math.max(max,dp[j]);
            }
            dp[i] = 1+max;
            res = Math.max(dp[i],res);
        }
        return res;
    }
}
