//package Leetcode.169. Majority Element;

class Solution {
    public int majorityElement(int[] nums) {
        int ele = Integer.MIN_VALUE;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                ele = nums[i];
                count++;
            }

            else if (nums[i] == ele)
                count++;
            else if (nums[i] != ele)
                count--;
        }
        return ele;
    }
}
