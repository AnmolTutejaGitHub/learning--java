//package Leetcode.3195. Find the Minimum Area to Cover All Ones I;
class Solution {
    public int minimumArea(int[][] grid) {
        int top_i = Integer.MAX_VALUE;
        int bottom_i = Integer.MIN_VALUE;
        ;
        int left_j = Integer.MAX_VALUE;
        ;
        int right_j = Integer.MIN_VALUE;
        ;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    left_j = Math.min(left_j, j);
                    top_i = Math.min(top_i, i);
                    bottom_i = Math.max(bottom_i, i);
                    right_j = Math.max(right_j, j);
                }
            }
        }
        return (bottom_i - top_i + 1) * (right_j - left_j + 1);
    }
}