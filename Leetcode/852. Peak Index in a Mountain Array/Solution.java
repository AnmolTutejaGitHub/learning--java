//package Leetcode.852. Peak Index in a Mountain Array;

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length < 3)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (i - 1 >= 0 && i + 1 < arr.length && arr[i - 1] < arr[i] && arr[i + 1] < arr[i])
                return i;
        }
        return -1;
    }
}
