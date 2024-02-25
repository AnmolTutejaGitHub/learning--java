//package Leetcode.41. First Missing Positive;

class Solution {
    public int firstMissingPositive(int[] nums) {
        cyclicSort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                return i + 1;
        }
        return nums[nums.length - 1] + 1;
    }

    public static void cyclicSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctedIdx = arr[i] - 1;

            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correctedIdx]) {
                int temp = arr[i];
                arr[i] = arr[correctedIdx];
                arr[correctedIdx] = temp;
            } else {
                i++;
            }
        }
    }
}
