//package Leetcode.3206. Alternating Groups I;

class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int count = 0;
        for (int i = 0; i < colors.length; i++) {
            if (alternate(colors, i - 1, i, i + 1))
                count++;
        }
        return count;
    }

    public boolean alternate(int[] nums, int ni, int i, int pi) {
        int nums_ni = ni >= 0 ? nums[ni] : nums[nums.length - 1];
        int nums_i = nums[i];
        int nums_pi = pi < nums.length ? nums[pi] : nums[0];

        if (nums_ni == 0 && nums_pi == 0 && nums_i == 1)
            return true;
        if (nums_ni == 1 && nums_pi == 1 && nums_i == 0)
            return true;

        return false;
    }
}
