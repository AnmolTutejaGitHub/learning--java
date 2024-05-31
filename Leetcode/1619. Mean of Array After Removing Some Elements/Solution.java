// package Leetcode.1619. Mean of Array After Removing Some Elements;

import java.util.Arrays;

class Solution {
    public double trimMean(int[] arr) {
        double sum = 0;
        Arrays.sort(arr);
        double num = arr.length * 0.05;

        for (int i = (int) num; i < arr.length - num; i++) {
            sum += arr[i];
        }
        return sum / (arr.length - 2 * num);
    }
}