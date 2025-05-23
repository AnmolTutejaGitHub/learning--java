//package Leetcode.746. Min Cost Climbing Stairs;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int dp[] = new int[cost.length];
        int n = cost.length;
        dp[n-1] = cost[n-1];
        dp[n-2] = cost[n-2];


        for(int i=n-3;i>=0;i--){
            if(i+1<cost.length && i+2<cost.length) dp[i] = cost[i]+Math.min(dp[i+1],dp[i+2]);
        }
        return Math.min(dp[0],dp[1]);
    }
}
