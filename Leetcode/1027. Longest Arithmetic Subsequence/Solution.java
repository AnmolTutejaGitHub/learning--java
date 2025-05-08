//package Leetcode.1027. Longest Arithmetic Subsequence;

import java.util.Arrays;

class Solution {
    public int longestArithSeqLength(int[] nums) {
        int n = nums.length;
        int dp[][] = new int[n][1002];
        for(int[] row : dp) Arrays.fill(row,1);
        int max = 0;

        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                int diff = nums[i]-nums[j]+500;
                if(dp[j][diff]+1 > dp[i][diff]){
                    dp[i][diff] = 1+dp[j][diff];
                    max = Math.max(max,dp[i][diff]);
                }
            }
        }
        return max;
    }
}
