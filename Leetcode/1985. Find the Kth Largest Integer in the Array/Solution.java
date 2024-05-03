// package Leetcode.1985. Find the Kth Largest Integer in the Array;

import java.math.*;
import java.util.Arrays;

class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        BigInteger[] arr = new BigInteger[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = new BigInteger(nums[i]);
        }

        Arrays.sort(arr);

        return "" + arr[arr.length - k];
    }
}
