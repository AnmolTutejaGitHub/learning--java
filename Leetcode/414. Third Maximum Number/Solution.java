//package Leetcode.414. Third Maximum Number;

import java.util.Arrays;

class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int l = nums[nums.length - 1];
        if (nums.length <= 2)
            return l;

        int count = 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1])
                count++;
            if (count == 3)
                return nums[i];
        }
        return l;
    }
}
