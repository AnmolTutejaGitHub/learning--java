//package Leetcode.283. Move Zeroes;

// class Solution {
//     public void moveZeroes(int[] nums) {
//         for (int i = 0; i < nums.length; i++) {
//             for (int j = 0; j < nums.length; j++) {
//                 if (j + 1 < nums.length && nums[j] == 0) {
//                     int temp = nums[j];
//                     nums[j] = nums[j + 1];
//                     nums[j + 1] = temp;
//                 }
//             }
//         }

//     }
//}

class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
            else
                nums[j++] = nums[i];
        }

        int e = nums.length - 1;
        while (count != 0) {
            nums[e--] = 0;
            count--;
        }
    }
}
