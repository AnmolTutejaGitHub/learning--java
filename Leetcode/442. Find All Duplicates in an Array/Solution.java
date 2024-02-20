//package Leetcode.442. Find All Duplicates in an Array;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        cyclicSort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1)
                ans.add(nums[i]);
        }
        return ans;

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
