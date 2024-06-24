//package Leetcode.3191. Minimum Operations to Make Binary Array Elements Equal to One I;

class Solution {
    public int minOperations(int[] nums) {
        int s = 0;
        int ans = 0;
        for (int e = 2; e < nums.length; e++) {
            if (e - s + 1 == 3) {
                if (nums[s] == 0) {
                    flip(nums, s);
                    ans++;
                }
                s++;
            }
        }

        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 0)
                return -1;
        return ans;
    }

    public void flip(int nums[], int s) {
        int count = 3;
        while (count > 0 && s < nums.length) {
            if (nums[s] == 0)
                nums[s] = 1;
            else
                nums[s] = 0;
            s++;
            count--;
        }
    }
}
