//package Leetcode.198. House Robber;

class Solution {
    public int rob(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length<2) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);

       for(int i=2;i<dp.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
       }

       return dp[nums.length-1];
    }
}