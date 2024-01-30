//package Leetcode.2161. Partition Array According to Given Pivot;

class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] arr = new int[nums.length];

        int arrIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < pivot) {
                arr[arrIndex] = nums[i];
                arrIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == pivot) {
                arr[arrIndex] = pivot;
                arrIndex++;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > pivot) {
                arr[arrIndex] = nums[i];
                arrIndex++;
            }
        }

        return arr;
    }
}
