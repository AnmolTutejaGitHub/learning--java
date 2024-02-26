//package Leetcode.905. Sort Array By Parity;

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] % 2 != 0) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
    }
}
