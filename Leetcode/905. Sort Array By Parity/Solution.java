//package Leetcode.905. Sort Array By Parity;

// class Solution {
//     public int[] sortArrayByParity(int[] nums) {

//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length - 1; j++) {
//                 if (nums[j] % 2 != 0) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }
//         return nums;
//     }
// }

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            while (left < right && nums[left] % 2 == 0)
                left++;
            while (left < right && nums[right] % 2 != 0)
                right--;

            if (left < right) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            } else
                return nums;
        }
        return nums;
    }
}
