//package Leetcode.1827. Minimum Operations to Make the Array Increasing;

class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            while (nums[i] >= nums[i + 1]) {

                count++;
                nums[i + 1]++;

            }
        }
        return count;
    }
}
