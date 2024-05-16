// package Leetcode.215. Kth Largest Element in an Array;

// // fucking TIL

// class Solution {
// public int findKthLargest(int[] nums, int k) {
// int ans = -1;
// int count = 0;
// while (count < k) {
// int[] max = maximum(nums);
// ans = max[0];
// nums[max[1]] = Integer.MIN_VALUE;
// count++;
// }
// return ans;

// }

// static int[] maximum(int[] arr) {
// int max = Integer.MIN_VALUE;
// int maxIndex = -1;
// for (int i = 0; i < arr.length; i++) {
// if (arr[i] > max) {
// max = arr[i];
// maxIndex = i;
// }
// }
// return new int[] { max, maxIndex };
// }
// }

import java.util.PriorityQueue;

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> maxq = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++)
            maxq.add(nums[i]);
        for (int i = 1; i < k; i++)
            maxq.poll();
        return maxq.peek();
    }
}
