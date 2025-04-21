//package Leetcode.45. Jump Game II;

class Solution {
    public int jump(int[] nums) {
        int dp[] = new int[nums.length];
        if(nums.length==1) return 0;
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2;i<nums.length;i++){
            int min = Integer.MAX_VALUE;
            for(int j=i-1;j>=0;j--){
                if(j+nums[j]>=i){
                    min = Math.min(dp[j],min);
                }
                dp[i] = 1+min;
            }
        }
        return dp[nums.length-1];
    }
}