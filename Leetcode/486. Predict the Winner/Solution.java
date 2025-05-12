//package Leetcode.486. Predict the Winner;

class Solution {
    public boolean predictTheWinner(int[] nums) {
        int sum = 0;
        for (int i : nums) sum+=i;
        int[][] memo = new int[nums.length][nums.length];
        int player1 = dp(nums,0,nums.length-1,memo);
        return player1>=sum-player1;
    }

    public int dp(int[] nums,int start,int end,int[][]memo){
        if(start>end) return 0;
        if(start==end) return nums[start];
        if(memo[start][end]!=0) return memo[start][end];

        int s = nums[start]+Math.min(dp(nums,start+2,end,memo),dp(nums,start+1,end-1,memo));
        int e = nums[end]+Math.min(dp(nums,start,end-2,memo),dp(nums,start+1,end-1,memo));
        memo[start][end] = Math.max(s,e);
        return memo[start][end];
    }
}
