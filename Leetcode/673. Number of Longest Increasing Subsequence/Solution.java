//package Leetcode.673. Number of Longest Increasing Subsequence;

import java.util.Arrays;

class Solution {
    public int findNumberOfLIS(int[] nums) {
        int dp[] = new int[nums.length];
        Arrays.fill(dp,1);
        int longest = 0;
        int count[] = new int[nums.length];
        Arrays.fill(count,1);

        for(int i=0;i<nums.length;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j]) {
                    if(dp[i]<dp[j]+1) {dp[i] = dp[j]+1; count[i]=count[j];}
                    else if(dp[i]==dp[j]+1) count[i]+=count[j];
                }
            }
            longest = Math.max(dp[i],longest);
        }

        int res = 0;
        for (int i=0; i<nums.length;i++) {
            if(dp[i] == longest) res += count[i];
        }

        return res;
    }
}
