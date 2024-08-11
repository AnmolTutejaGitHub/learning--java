//package Leetcode.695. Max Area of Island;

class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        boolean vis[][] = new boolean[grid.length][grid[0].length];
        int max = 0;
        int currArea[] = new int[1];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    dfs(i, j, grid, vis, grid.length, grid[0].length, currArea);
                    max = Math.max(currArea[0], max);
                    currArea[0] = 0;
                }
            }
        }
        return max;
    }

    public void dfs(int row, int col, int[][] grid, boolean[][] vis, int n, int m, int currArea[]) {
        vis[row][col] = true;

        currArea[0]++;

        if (row + 1 < n && !vis[row + 1][col] && grid[row + 1][col] == 1)
            dfs(row + 1, col, grid, vis, n, m, currArea);
        if (row - 1 >= 0 && !vis[row - 1][col] && grid[row - 1][col] == 1)
            dfs(row - 1, col, grid, vis, n, m, currArea);
        if (col + 1 < m && !vis[row][col + 1] && grid[row][col + 1] == 1)
            dfs(row, col + 1, grid, vis, n, m, currArea);
        if (col - 1 >= 0 && !vis[row][col - 1] && grid[row][col - 1] == 1)
            dfs(row, col - 1, grid, vis, n, m, currArea);
    }
}