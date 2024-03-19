//package Leetcode.1752. Check if Array Is Sorted and Rotated;

class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[(i + 1) % nums.length])
                count++;
        }

        return count <= 1;
    }
}
