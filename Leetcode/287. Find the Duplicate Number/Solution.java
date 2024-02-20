//package Leetcode.287. Find the Duplicate Number;

class Solution {
    public int findDuplicate(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return nums[i];
        }

        return -1;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctInx = arr[i] - 1;
            if (arr[i] != arr[correctInx]) {
                int temp = arr[i];
                arr[i] = arr[correctInx];
                arr[correctInx] = temp;
            } else {
                i++;
            }
        }
    }
}
