//package Leetcode.4. Median of Two Sorted Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] arr = merge(nums1, nums2);

        if (arr.length % 2 == 0)
            return (double) (arr[(arr.length - 1) / 2] + arr[arr.length / 2]) / 2;

        return arr[arr.length / 2];
    }

    public int[] merge(int[] arr1, int[] arr2) {

        int[] mix = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mix[k] = arr1[i];
                i++;
            } else {
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            mix[k] = arr1[i];
            i++;
            k++;
        }

        while (j < arr2.length) {
            mix[k] = arr2[j];
            j++;
            k++;
        }

        return mix;
    }
}