//package Leetcode.3194. Minimum Average of Smallest and Largest Elements;

import java.util.Arrays;

class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min = Integer.MAX_VALUE;
        int n = nums.length;
        int i = 0;
        int j = nums.length - 1;

        while (i < n) {
            min = Math.min((double) (nums[i] + nums[j]) / 2, min);
            i++;
            j--;
        }
        return min;
    }
}
