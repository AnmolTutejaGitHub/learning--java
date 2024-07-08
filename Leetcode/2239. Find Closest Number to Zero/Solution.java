//package Leetcode.2239. Find Closest Number to Zero;

class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        int ans = -1;
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[i]) < min) {
                min = Math.abs(nums[i]);
                ans = nums[i];
            }

            else if (Math.abs(nums[i]) == min) {
                ans = Math.max(nums[i], ans);
            }
        }
        return ans;
    }
}
