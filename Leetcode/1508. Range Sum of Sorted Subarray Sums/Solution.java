//package Leetcode.1508. Range Sum of Sorted Subarray Sums;

import java.util.Arrays;

class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int size = n * (n + 1) / 2;
        int arr[] = new int[size];
        int idx = 0;

        for (int i = 0; i < nums.length; i++) {
            int prefix = 0;
            for (int j = i; j < nums.length; j++) {
                prefix += nums[j];
                arr[idx++] = prefix;
            }
        }

        int M = 1000000007;
        Arrays.sort(arr);
        int sum = 0;
        for (int i = left - 1; i < right; i++) {
            sum += arr[i];
            sum %= M;
        }
        return sum;
    }
}
