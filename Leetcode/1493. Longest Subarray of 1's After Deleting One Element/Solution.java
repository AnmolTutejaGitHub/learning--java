//package Leetcode.1493. Longest Subarray of 1's After Deleting One Element;

class Solution {
    public int longestSubarray(int[] nums) {
        int maxLen = 0;
        int start = 0;
        int zeroCount = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                zeroCount++;

            if (zeroCount > 1) {
                while (nums[start] != 0 && start <= end) {
                    start++;
                }
                if (start < end) {
                    start++;
                    zeroCount--;
                }
            }

            maxLen = Math.max(maxLen, end - start);
        }
        return maxLen;
    }
}

// intution : keep at most one zero in dynamic sliding window
// make counter to keep track of no of zeros
// if zerocounter > 1 means 2 zeros in sliding window
// move start till there is only one zero in the window , decement zero counter
// if that found
// keep track of maxLen of sliding window
