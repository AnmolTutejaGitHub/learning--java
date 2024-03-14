//package Leetcode.930. Binary Subarrays With Sum;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0;
        int sum;
        for (int i = 0; i < nums.length; i++) {
            sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == goal)
                    count++;
                if (sum > goal)
                    break;
            }
        }
        return count;
    }
}
