//package Leetcode.945. Minimum Increment to Make Array Unique;

import java.util.Arrays;

class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int prev = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= prev) {
                count += prev - nums[i] + 1;
                nums[i] = prev + 1;
            }
            prev = nums[i];
        }
        return count;
    }
}