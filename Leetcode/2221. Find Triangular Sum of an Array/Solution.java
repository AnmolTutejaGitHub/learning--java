//package Leetcode.2221. Find Triangular Sum of an Array;

class Solution {
    public int triangularSum(int[] nums) {
        int[] result = new int[nums.length];
        int n = nums.length;
        result = nums;

        while (n != 1) {
            for (int i = 0; i < nums.length - 1; i++) {
                result[i] = (result[i] + result[i + 1]) % 10;
            }
            n--;
        }
        return result[0];
    }
}
