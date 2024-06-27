//package Leetcode.200. Number of Islands;

import java.util.*;

class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && grid[i][j] == '1') {
                    bfs(grid, i, j, vis);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(char[][] grid, int row_, int col_, boolean[][] vis) {
        int n = grid.length;
        int m = grid[0].length;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(row_, col_));

        while (!q.isEmpty()) {
            int row = q.peek().row;
            int col = q.peek().col;
            q.remove();

            if (row + 1 < n && grid[row + 1][col] == '1' && !vis[row + 1][col]) {
                vis[row + 1][col] = true;
                q.add(new Pair(row + 1, col));
            }

            if (row - 1 >= 0 && grid[row - 1][col] == '1' && !vis[row - 1][col]) {
                vis[row - 1][col] = true;
                q.add(new Pair(row - 1, col));
            }

            if (col - 1 >= 0 && grid[row][col - 1] == '1' && !vis[row][col - 1]) {
                vis[row][col - 1] = true;
                q.add(new Pair(row, col - 1));
            }

            if (col + 1 < m && grid[row][col + 1] == '1' && !vis[row][col + 1]) {
                vis[row][col + 1] = true;
                q.add(new Pair(row, col + 1));
            }
        }
    }
}
