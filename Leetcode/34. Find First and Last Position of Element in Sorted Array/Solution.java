//package Leetcode.34. Find First and Last Position of Element in Sorted Array;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = linearSearch(nums, target);
        return ans;
    }

    public static int[] linearSearch(int[] nums, int target) {
        int ans[] = new int[] { -1, -1 };
        for (int i = 0; i < nums.length; i++) {
            if (ans[0] == -1 && nums[i] == target) {
                ans[0] = i;
            } else if (nums[i] == target)
                ans[1] = i;
        }
        if (ans[0] != -1 && ans[1] == -1)
            ans[1] = ans[0];
        return ans;
    }
}