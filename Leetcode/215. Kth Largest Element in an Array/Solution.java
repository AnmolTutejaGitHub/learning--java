//package Leetcode.215. Kth Largest Element in an Array;

// fucking TIL

class Solution {
    public int findKthLargest(int[] nums, int k) {
        int ans = -1;
        int count = 0;
        while (count < k) {
            int[] max = maximum(nums);
            ans = max[0];
            nums[max[1]] = Integer.MIN_VALUE;
            count++;
        }
        return ans;

    }

    static int[] maximum(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return new int[] { max, maxIndex };
    }
}
