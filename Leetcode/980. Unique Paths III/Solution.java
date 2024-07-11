//package Leetcode.980. Unique Paths III;

class Solution {
    public int uniquePathsIII(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int[] count = new int[1];
        int non_obstracles = 2;
        int start_i = -1;
        int start_j = -1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    start_i = i;
                    start_j = j;
                } else if (grid[i][j] == 0)
                    non_obstracles++;
            }
        }

        backtrack(start_i, start_j, grid, vis, count, n, m, non_obstracles, 0);
        return count[0];
    }

    public void backtrack(int row, int col, int[][] grid, boolean[][] vis, int[] count, int n, int m,
            int non_obstracles, int visited) {
        if (row >= n || col >= m || row < 0 || col < 0 || vis[row][col] || grid[row][col] == -1)
            return;

        vis[row][col] = true;
        visited++;

        if (grid[row][col] == 2) {
            if (visited == non_obstracles)
                count[0]++;
            vis[row][col] = false;
            visited--;
            return;
        }

        backtrack(row + 1, col, grid, vis, count, n, m, non_obstracles, visited);
        backtrack(row - 1, col, grid, vis, count, n, m, non_obstracles, visited);
        backtrack(row, col + 1, grid, vis, count, n, m, non_obstracles, visited);
        backtrack(row, col - 1, grid, vis, count, n, m, non_obstracles, visited);

        vis[row][col] = false;
        visited--;
    }
}