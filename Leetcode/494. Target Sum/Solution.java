//package Leetcode.494. Target Sum;

class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int count[] = new int[1];
        helper(0, target, nums, count);
        return count[0];
    }

    public void helper(int idx, int target, int[] arr, int[] count) {
        if (idx == arr.length) {
            if (target == 0) {
                count[0]++;
            }
            return;
        }

        helper(idx + 1, target + arr[idx], arr, count);
        helper(idx + 1, target - arr[idx], arr, count);
    }
}
