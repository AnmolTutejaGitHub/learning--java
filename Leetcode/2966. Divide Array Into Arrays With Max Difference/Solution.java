//package Leetcode.2966. Divide Array Into Arrays With Max Difference;

import java.util.Arrays;

class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int[][] res = new int[nums.length / 3][3];
        int row = 0;
        int col = 0;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {

            if (col == 1 && nums[i] - nums[i - 1] > k)
                return new int[0][0];
            if (col == 2 && nums[i] - nums[i - 2] > k)
                return new int[0][0];

            res[row][col] = nums[i];
            col++;
            if (col == 3) {
                row++;
                col = 0;
            }
        }
        return res;
    }
}