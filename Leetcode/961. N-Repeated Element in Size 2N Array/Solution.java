//package Leetcode.961. N-Repeated Element in Size 2N Array;

class Solution {
    public int repeatedNTimes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int localfreq = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    localfreq++;
            }
            if (localfreq == nums.length / 2)
                return nums[i];
        }
        return -1;
    }
}