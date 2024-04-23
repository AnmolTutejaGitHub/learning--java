//package Leetcode.643. Maximum Average Subarray I Solved;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        double maxAvg = Integer.MIN_VALUE;

        int s = 0;
        for (int e = 0; e < nums.length; e++) {
            sum += nums[e];
            if (e - s + 1 == k) {
                maxAvg = Math.max((double) sum / k, maxAvg);
                sum -= nums[s++];
            }
        }
        return maxAvg;
    }
}
