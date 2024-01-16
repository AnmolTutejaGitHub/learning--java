//package Leetcode.2154. Keep Multiplying Found Values by Two;

import java.util.Arrays;

class Solution {
    public int findFinalValue(int[] nums, int original) {

        // for(int i=0;i<nums.length;i++)
        // while(true)
        while (true) {
            if (binarySearch(original, nums)) {
                original = 2 * original;
            } else {
                // original = 2 * original;
                break;
            }
        }

        return original;
    }

    public boolean binarySearch(int target, int[] arr) {
        int[] cpyarr = Arrays.copyOf(arr, arr.length);

        Arrays.sort(cpyarr);

        int left = 0;
        int right = cpyarr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (cpyarr[mid] == target)
                return true;
            if (target > cpyarr[mid])
                left = mid + 1;
            if (target < cpyarr[mid])
                right = mid - 1;
        }
        return false;
    }
}
