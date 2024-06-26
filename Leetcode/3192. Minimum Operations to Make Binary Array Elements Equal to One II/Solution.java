//package Leetcode.3192. Minimum Operations to Make Binary Array Elements Equal to One II;

class Solution {
    public int minOperations(int[] nums) {
        int flip = 0;

        for (int i = 0; i < nums.length; i++) {
            if (flip % 2 == 0) {
                if (nums[i] == 0) {
                    flipp(nums, i);
                    flip++;
                }
            } else if (flip % 2 != 0) {
                // nums[i]=!nums[i];
                flipp(nums, i);
                if (nums[i] == 0) {
                    flipp(nums, i);
                    flip++;
                }
            }
        }
        return flip;
    }

    public void flipp(int[] nums, int i) {
        if (nums[i] == 0)
            nums[i] = 1;
        else
            nums[i] = 0;
    }
}
