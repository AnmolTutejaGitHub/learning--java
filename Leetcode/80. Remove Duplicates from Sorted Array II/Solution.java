//package Leetcode.80. Remove Duplicates from Sorted Array II;

import java.util.Arrays;

class Solution {
    public int removeDuplicates(int[] nums) {

        int set = 0;
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] != Integer.MAX_VALUE && nums[i] == nums[j]) {
                    count++;
                    if (count > 2) {
                        nums[j] = Integer.MAX_VALUE;
                        set++;
                    }
                }
            }

        }
        Arrays.sort(nums);
        return nums.length - set;
    }
}
