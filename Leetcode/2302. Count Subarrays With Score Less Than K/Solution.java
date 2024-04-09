//package Leetcode.2302. Count Subarrays With Score Less Than K;

class Solution {
    public long countSubarrays(int[] nums, long k) {
        int s = 0;
        long sum = 0;
        long count = 0;

        for (int e = 0; e < nums.length; e++) {
            sum += nums[e];

            while (sum * (e - s + 1) >= k) {
                sum -= nums[s];
                s++;
            }

            if (sum * (e - s + 1) < k)
                count += (e - s + 1);
        }
        return count;
    }
}
