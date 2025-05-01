//package Leetcode.416. Partition Equal Subset Sum;

class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }

        if(sum%2==1) return false;

        boolean dp[] = new boolean[sum/2 + 1];
        dp[0] = true;

        for(int i=0;i<nums.length;i++){
            for(int j=dp.length-1;j>=0;j--){
                if(j - nums[i]>=0 && dp[j - nums[i]]==true) dp[j] = true;
            }
        }
        return dp[sum/2];
    }
}
