//package Leetcode.1685. Sum of Absolute Differences in a Sorted Array;

class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        prefix[0] = nums[0];
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        suffix[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            res[i] = (nums[i] * i - prefix[i]) + (suffix[i] - nums[i] * (n - i - 1));
        }

        return res;

    }
}
