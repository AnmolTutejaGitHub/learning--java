//package Leetcode.213. House Robber II;

import java.util.Arrays;

class Solution {
    public int rob(int[] nums) {
        if(nums.length<2) return nums[0];
        int a = HouseRobber(Arrays.copyOfRange(nums,1,nums.length));     
        int b = HouseRobber(Arrays.copyOfRange(nums,0,nums.length-1));   
        
        return Math.max(a,b);
    }
    public int HouseRobber(int [] nums){
        int dp[] = new int[nums.length];
        if(nums.length==0) return 0;
        if(nums.length<2) return nums[0];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);

        for(int i=2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i]);
        }
        return dp[nums.length-1];
    }
}
