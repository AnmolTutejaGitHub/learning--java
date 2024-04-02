//package Leetcode.1004. Max Consecutive Ones III;

class Solution {
    public int longestOnes(int[] nums, int k) {
        int zeroCount = 0;
        int start = 0;
        int maxLen = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0)
                zeroCount++;

            // if(zeroCount>k){
            while (zeroCount > k) {
                if (nums[start] == 0)
                    zeroCount--;
                start++;
            }
            // }

            if (zeroCount <= k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen;
    }
}
