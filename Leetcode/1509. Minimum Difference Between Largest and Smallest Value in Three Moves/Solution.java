//package Leetcode.1509. Minimum Difference Between Largest and Smallest Value in Three Moves;

class Solution {
    public int minDifference(int[] nums) {
        Arrays.sort(nums);
        if (nums.length <= 4)
            return 0;
        int diff1 = nums[nums.length - 1] - nums[3];
        int diff2 = nums[nums.length - 2] - nums[2];
        int diff3 = nums[nums.length - 3] - nums[1];
        int diff4 = nums[nums.length - 4] - nums[0];

        return Math.min(Math.min(diff1, diff2), Math.min(diff3, diff4));
    }
}
