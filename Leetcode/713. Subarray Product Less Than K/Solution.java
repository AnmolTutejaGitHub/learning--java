//package Leetcode.713. Subarray Product Less Than K;

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int currProduct = 1;
        int count = 0;

        int start = 0;
        for (int end = 0; end < nums.length; end++) {
            currProduct *= nums[end];
            while (currProduct >= k && start < end) {
                currProduct /= nums[start];
                start++;
            }
            if (currProduct < k)
                count += end - start + 1;
        }
        return count;
    }
}