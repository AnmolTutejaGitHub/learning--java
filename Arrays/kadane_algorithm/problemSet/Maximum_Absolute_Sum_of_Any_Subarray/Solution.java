package kadane_algorithm.problemSet.Maximum_Absolute_Sum_of_Any_Subarray;

// https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/description/

class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            max = Math.max(currSum, max);
        }

        int min = Integer.MAX_VALUE;
        currSum = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum = Math.min(nums[i], currSum + nums[i]);
            min = Math.min(min, currSum);
        }

        return Math.max(max, Math.abs(min));
    }
}
