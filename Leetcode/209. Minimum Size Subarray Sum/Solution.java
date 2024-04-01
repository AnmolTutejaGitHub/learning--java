//package Leetcode.209. Minimum Size Subarray Sum;

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int windowStart = 0;
        int minLen = Integer.MAX_VALUE;
        int currSum = 0;

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            currSum += nums[windowEnd];
            while (currSum >= target) {
                minLen = Math.min(minLen, windowEnd - windowStart + 1);
                currSum -= nums[windowStart];
                windowStart++;
            }
        }

        if (minLen == Integer.MAX_VALUE)
            return 0;
        return minLen;
    }
}
