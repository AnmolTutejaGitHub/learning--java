//package Leetcode.1219. Path with Maximum Gold;

class Solution {
    public int getMaximumGold(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int max[] = new int[1];
        int sum[] = new int[1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] != 0)
                    backtrack(grid, i, j, vis, max, n, m, sum);
            }
        }
        return max[0];
    }

    public void backtrack(int[][] grid, int row, int col, boolean[][] vis, int[] max, int n, int m, int[] sum) {
        if (row >= n || col >= m || row < 0 || col < 0 || vis[row][col] || grid[row][col] == 0)
            return;

        vis[row][col] = true;
        sum[0] += grid[row][col];
        max[0] = Math.max(max[0], sum[0]);
        backtrack(grid, row + 1, col, vis, max, n, m, sum);
        backtrack(grid, row - 1, col, vis, max, n, m, sum);
        backtrack(grid, row, col + 1, vis, max, n, m, sum);
        backtrack(grid, row, col - 1, vis, max, n, m, sum);
        sum[0] -= grid[row][col];
        vis[row][col] = false;
    }
}
