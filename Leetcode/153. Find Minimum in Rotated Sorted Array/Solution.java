//package Leetcode.153. Find Minimum in Rotated Sorted Array;

class Solution {
    public int findMin(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.min(nums[0], nums[1]);

        int start = 0;
        int end = nums.length - 1;
        int min = Integer.MAX_VALUE;

        while (start <= end) {
            if (end == start + 1) {
                min = Math.min(min, Math.min(nums[start], nums[end]));
                break;
            }

            int mid = start + (end - start) / 2;

            if (nums[start] < nums[mid]) {
                min = Math.min(min, nums[start]);
                start = mid + 1;
            } else {
                min = Math.min(min, nums[mid]);
                end = mid - 1;
            }
        }

        return min;
    }
}
