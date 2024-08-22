//package Leetcode.2596. Check Knight Tour Configuration;

class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if (grid[0][0] != 0)
            return false;
        int[][] dir = { { -1, 2 }, { -2, 1 }, { -2, -1 }, { -1, -2 }, { 1, 2 }, { 2, 1 }, { 2, -1 }, { 1, -2 } };

        int end = 0;
        for (int[] row : grid) {
            for (int ele : row) {
                end = Math.max(ele, end);
            }
        }

        return Allmoves(0, grid, 0, 0, end, dir);
    }

    public boolean Allmoves(int idx, int[][] grid, int row, int col, int end, int[][] dir) {

        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length)
            return false;
        if (grid[row][col] != idx)
            return false;
        if (grid[row][col] == end)
            return true;

        boolean isValid = false;

        for (int[] pos : dir) {
            if (Allmoves(idx + 1, grid, row + pos[0], col + pos[1], end, dir)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }
}
