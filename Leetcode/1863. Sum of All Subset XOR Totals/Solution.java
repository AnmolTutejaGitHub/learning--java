// package Leetcode.1863. Sum of All Subset XOR Totals;
class Solution {
    public int subsetXORSum(int[] nums) {
        int [] sum = new int[1];
        backtrack(0,nums,0,sum);
        return sum[0];
    }

    public void backtrack(int index,int[]nums,int xor,int[]sum){
        if(index==nums.length) {
            sum[0]+=xor;
            return;
        }

        backtrack(index+1,nums,xor^nums[index],sum);
        backtrack(index+1,nums,xor,sum);
    }
}