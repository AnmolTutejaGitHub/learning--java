//package Leetcode.53. Maximum Subarray;

class Solution {
    public int maxSubArray(int[] nums) {
        // int currSum=0;
        // int FinalSum= Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        // for(int j=i;j<nums.length;j++){
        // currSum=0;
        // for(int k=i;k<=j;k++){
        // currSum+=nums[k];
        // }
        // if(currSum>FinalSum) FinalSum=currSum;
        // }
        // }

        // if(nums.length == 1) return nums[0];
        // return FinalSum;

        if (nums.length == 1)
            return nums[0];
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);

            maxSum = Math.max(currSum, maxSum);
        }

        return maxSum;
    }
}
