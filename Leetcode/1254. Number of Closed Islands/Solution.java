//package Leetcode.1254. Number of Closed Islands;

class Solution {
    public int closedIsland(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean vis[][] = new boolean[n][m];
        int count = 0;
        boolean unclosed[] = new boolean[1];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                unclosed[0] = false;
                if (!vis[i][j] && grid[i][j] == 0) {
                    dfs(grid, unclosed, i, j, vis);
                    if (!unclosed[0])
                        count++;
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, boolean[] unclosed, int row, int col, boolean[][] vis) {
        vis[row][col] = true;
        int n = grid.length;
        int m = grid[0].length;

        if (row + 1 >= n || row - 1 < 0 || col + 1 >= m || col - 1 < 0) {
            unclosed[0] = true;
            // return;
        }

        if (row + 1 < n && !vis[row + 1][col] && grid[row + 1][col] == 0)
            dfs(grid, unclosed, row + 1, col, vis);
        if (row - 1 >= 0 && !vis[row - 1][col] && grid[row - 1][col] == 0)
            dfs(grid, unclosed, row - 1, col, vis);
        if (col + 1 < m && !vis[row][col + 1] && grid[row][col + 1] == 0)
            dfs(grid, unclosed, row, col + 1, vis);
        if (col - 1 >= 0 && !vis[row][col - 1] && grid[row][col - 1] == 0)
            dfs(grid, unclosed, row, col - 1, vis);
    }
}
