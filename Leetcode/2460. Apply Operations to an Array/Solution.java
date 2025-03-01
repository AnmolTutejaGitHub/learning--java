// package Leetcode.2460. Apply Operations to an Array;

// class Solution {
// public int[] applyOperations(int[] nums) {
// for (int i = 0; i < nums.length; i++) {
// // if(nums[i] == nums[i + 1]){nums[i]*=2;}
// if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
// nums[i + 1] = 0;
// nums[i] *= 2;
// }

// }
// for (int i = 0; i < nums.length; i++) {

// for (int j = 0; j < nums.length; j++) {
// if (nums[j] == 0 && j < nums.length - 1) {
// int temp = nums[j];
// nums[j] = nums[j + 1];
// nums[j + 1] = temp;
// }
// }
// }
// return nums;
// }
// }

// optimised 
class Solution {
    public int[] applyOperations(int[] nums) {
        int res[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 < nums.length && nums[i] == nums[i + 1]) {
                nums[i + 1] = 0;
                nums[i] *= 2;
            }

        }

        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                res[j++] = nums[i];
        }
        return res;
    }
}