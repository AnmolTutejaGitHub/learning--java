//package Leetcode.628. Maximum Product of Three Numbers;

class Solution {
    public int maximumProduct(int[] nums) {
        int max[] = { Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE };
        int min[] = { Integer.MAX_VALUE, Integer.MAX_VALUE };

        for (int n : nums) {
            if (n > max[0]) {
                max[2] = max[1];
                max[1] = max[0];
                max[0] = n;
            } else if (n > max[1]) {
                max[2] = max[1];
                max[1] = n;
            } else if (n > max[2]) {
                max[2] = n;
            }

            if (n < min[0]) {
                min[1] = min[0];
                min[0] = n;
            } else if (n < min[1]) {
                min[1] = n;
            }
        }

        return Math.max(min[0] * min[1] * max[0], max[0] * max[1] * max[2]);
    }
}