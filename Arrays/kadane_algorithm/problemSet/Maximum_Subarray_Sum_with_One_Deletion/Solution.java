package kadane_algorithm.problemSet.Maximum_Subarray_Sum_with_One_Deletion;

// https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/description/
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