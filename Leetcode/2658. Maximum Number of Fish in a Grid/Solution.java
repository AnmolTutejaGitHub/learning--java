//package Leetcode.2658. Maximum Number of Fish in a Grid;

class Solution {
    public int findMaxFish(int[][] grid) {
        int max = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    int curr = dfs(i, j, grid);
                    max = Math.max(max, curr);
                }
            }
        }
        return max;
    }

    public int dfs(int r, int c, int[][] grid) {
        if (r >= grid.length || c >= grid[0].length || r < 0 || c < 0 || grid[r][c] == 0)
            return 0;

        int sum = grid[r][c];
        grid[r][c] = 0;

        if (r + 1 < grid.length)
            sum += dfs(r + 1, c, grid);
        if (r - 1 >= 0)
            sum += dfs(r - 1, c, grid);
        if (c + 1 < grid[0].length)
            sum += dfs(r, c + 1, grid);
        if (c - 1 >= 0)
            sum += dfs(r, c - 1, grid);

        return sum;
    }
}