//package Leetcode.1568. Minimum Number of Days to Disconnect Island;

class Solution {
    public int minDays(int[][] grid) {
        if (islands(grid) != 1)
            return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    grid[i][j] = 0;
                    if (islands(grid) != 1)
                        return 1;
                    grid[i][j] = 1;
                }
            }
        }
        return 2;
    }

    public int islands(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (!vis[i][j] && grid[i][j] == 1) {
                    dfs(i, j, grid, vis, n, m);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int row, int col, int[][] grid, boolean[][] vis, int n, int m) {
        vis[row][col] = true;

        if (row + 1 < n && !vis[row + 1][col] && grid[row + 1][col] == 1)
            dfs(row + 1, col, grid, vis, n, m);
        if (row - 1 >= 0 && !vis[row - 1][col] && grid[row - 1][col] == 1)
            dfs(row - 1, col, grid, vis, n, m);
        if (col + 1 < m && !vis[row][col + 1] && grid[row][col + 1] == 1)
            dfs(row, col + 1, grid, vis, n, m);
        if (col - 1 >= 0 && !vis[row][col - 1] && grid[row][col - 1] == 1)
            dfs(row, col - 1, grid, vis, n, m);
    }
}