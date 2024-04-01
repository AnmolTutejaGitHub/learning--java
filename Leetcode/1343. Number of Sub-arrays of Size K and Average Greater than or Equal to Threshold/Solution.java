//package Leetcode.1343. Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold;

class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int start = 0;
        int currSum = 0;
        int count = 0;
        int avg = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];
            if (end - start + 1 == k) {
                avg = currSum / k;
                if (avg >= threshold)
                    count++;
                currSum -= arr[start];
                start++;
            }

        }
        return count;
    }
}
