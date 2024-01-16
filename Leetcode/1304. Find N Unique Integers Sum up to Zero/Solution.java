//package Leetcode.1304. Find N Unique Integers Sum up to Zero;

class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n / 2; i++) {
            arr[i - 1] = i + arr[i];
            arr[n - i] = -arr[i - 1];
        }
        return arr;
    }
}
