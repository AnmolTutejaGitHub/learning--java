//package Leetcode.1186. Maximum Subarray Sum with One Deletion;

class Solution {
    public int maximumSum(int[] arr) {
        int max = arr[0];
        int currSum = arr[0];
        int currSumDel = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currSumDel = Math.max(currSum, currSumDel + arr[i]);
            currSum = Math.max(arr[i], currSum + arr[i]);
            max = Math.max(max, Math.max(currSum, currSumDel));
        }

        return max;
    }
}
