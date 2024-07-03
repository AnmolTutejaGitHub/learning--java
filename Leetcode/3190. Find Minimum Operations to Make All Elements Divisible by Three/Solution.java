//package Leetcode.3190. Find Minimum Operations to Make All Elements Divisible by Three;

class Solution {
    public int minimumOperations(int[] nums) {
        int opr = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 3 != 0)
                opr++;
        }
        return opr;
    }
}
