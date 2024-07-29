//package Leetcode.3232. Find if Digit Game Can Be Won;

class Solution {
    public boolean canAliceWin(int[] nums) {
        int singleSum = 0;
        int doubleSum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (Single(nums[i]))
                singleSum += nums[i];
            else
                doubleSum += nums[i];
        }
        return singleSum != doubleSum;
    }

    public boolean Single(int n) {
        return n / 10 == 0;
    }
}
