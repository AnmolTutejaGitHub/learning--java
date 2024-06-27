//package Leetcode.1020. Number of Enclaves;

class Solution {
    public int numEnclaves(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    boolean boundary[] = new boolean[1];
                    int nonBound[] = new int[1];
                    dfs(grid, i, j, boundary, nonBound);
                    if (!boundary[0])
                        count += nonBound[0];
                }
            }
        }
        return count;
    }

    public void dfs(int[][] grid, int row, int col, boolean[] boundary, int[] count) {
        count[0]++;
        int n = grid.length;
        int m = grid[0].length;
        grid[row][col] = 0;

        if (row + 1 >= n || row - 1 < 0 || col + 1 >= m || col - 1 < 0)
            boundary[0] = true;
        if (row + 1 < n && grid[row + 1][col] == 1)
            dfs(grid, row + 1, col, boundary, count);
        if (row - 1 >= 0 && grid[row - 1][col] == 1)
            dfs(grid, row - 1, col, boundary, count);
        if (col + 1 < m && grid[row][col + 1] == 1)
            dfs(grid, row, col + 1, boundary, count);
        if (col - 1 >= 0 && grid[row][col - 1] == 1)
            dfs(grid, row, col - 1, boundary, count);

    }
}
