//package Leetcode.3065. Minimum Operations to Exceed Threshold Value I;

class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < k)
                count++;
        }
        return count;
    }
}
