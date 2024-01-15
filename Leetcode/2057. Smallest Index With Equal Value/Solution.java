//package Leetcode.2057. Smallest Index With Equal Value;

class Solution {
    public int smallestEqual(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                if (i < min)
                    min = i;
            }
        }
        return min != Integer.MAX_VALUE ? min : -1;
    }
}
