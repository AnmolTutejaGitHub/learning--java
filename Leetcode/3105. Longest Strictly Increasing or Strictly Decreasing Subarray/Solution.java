//package Leetcode.3105. Longest Strictly Increasing or Strictly Decreasing Subarray;
class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int size_i = 1;
        int size_d = 1;
        int max = 1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                size_i++;
                size_d = 1;
            } else if (nums[i] > nums[i + 1]) {
                size_d++;
                size_i = 1;
            } else {
                size_i = 1;
                size_d = 1;
            }
            max = Math.max(Math.max(size_d, size_i), max);
        }
        return max;
    }
}