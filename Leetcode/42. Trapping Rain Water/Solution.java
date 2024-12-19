//package Leetcode.42. Trapping Rain Water;

class Solution {
    public int trap(int[] height) {
        int prefix[] = new int[height.length];
        int suffix[] = new int[height.length];

        prefix[0] = height[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = Math.max(height[i], prefix[i - 1]);
        }

        suffix[suffix.length - 1] = height[suffix.length - 1];
        for (int i = suffix.length - 2; i >= 0; i--) {
            suffix[i] = Math.max(height[i], suffix[i + 1]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(suffix[i], prefix[i]) - height[i];
        }
        return sum;
    }
}
