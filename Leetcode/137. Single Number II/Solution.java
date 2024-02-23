//package Leetcode.137. Single Number II;

class Solution {
    public int singleNumber(int[] nums) {
        int freq[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    freq[i]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 1)
                return nums[i];
        }

        return -1;
    }
}
