//package Leetcode.896. Monotonic Array;

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean inc = false;
        boolean dec = false;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                inc = true;
                if (dec)
                    return false;
            } else if (nums[i] > nums[i + 1]) {
                dec = true;
                if (inc)
                    return false;
            }
        }

        if (inc && dec)
            return false;
        return true;
    }
}
