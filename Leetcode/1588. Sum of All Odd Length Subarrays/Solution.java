//package Leetcode.1588. Sum of All Odd Length Subarrays;

class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int prefix = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefix = 0;
            for (int j = i; j < arr.length; j++) {
                prefix += arr[j];
                if ((j - i + 1) % 2 != 0)
                    sum += prefix;
            }
        }
        return sum;
    }
}