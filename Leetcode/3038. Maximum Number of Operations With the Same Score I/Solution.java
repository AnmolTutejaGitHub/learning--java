//package Leetcode.3038. Maximum Number of Operations With the Same Score I;

class Solution {
    public int maxOperations(int[] nums) {
        int score = nums[1] + nums[0];
        int i = 2;
        int count = 1;
        while (i < nums.length - 1 && nums[i + 1] + nums[i] == score) {
            i += 2;
            count++;
        }
        return count;
    }
}
