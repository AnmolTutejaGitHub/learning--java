//package Leetcode.1909. Remove One Element to Make the Array Strictly Increasing;

/// failing test cases ............

import java.util.Arrays;

class Solution {
    public boolean canBeIncreasing(int[] nums) {
        // boolean swapped = false;
        // int count =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                // swapped = false;
                if (j + 1 < nums.length && nums[j] >= nums[j + 1]) {
                    nums[j] = Integer.MAX_VALUE;

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;

                    // count ++;
                    // swapped = true;

                }
                // if(swapped) count++;
            }
        }
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == Integer.MAX_VALUE)
                count++;
        }
        System.out.println(Arrays.toString(nums));

        return count == 1 || count == 0 ? true : false;
    }
}