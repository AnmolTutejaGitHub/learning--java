//package Leetcode.778. Swim in Rising Water;

import java.util.*;

class Pair {
    int row;
    int col;
    int time;

    Pair(int row, int col, int time) {
        this.row = row;
        this.col = col;
        this.time = time;
    }
}

class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.time - p2.time);
        boolean[][] vis = new boolean[n][m];

        pq.add(new Pair(0, 0, grid[0][0]));
        while (!pq.isEmpty()) {
            int row = pq.peek().row;
            int col = pq.peek().col;
            int time = pq.peek().time;
            pq.poll();

            vis[row][col] = true;
            if (row == n - 1 && col == n - 1)
                return time;

            if (row + 1 < n && !vis[row + 1][col]) {
                if (time < grid[row + 1][col])
                    pq.add(new Pair(row + 1, col, grid[row + 1][col]));
                else
                    pq.add(new Pair(row + 1, col, time));
            }

            if (row - 1 >= 0 && !vis[row - 1][col]) {
                if (time < grid[row - 1][col])
                    pq.add(new Pair(row - 1, col, grid[row - 1][col]));
                else
                    pq.add(new Pair(row - 1, col, time));
            }

            if (col + 1 < m && !vis[row][col + 1]) {
                if (time < grid[row][col + 1])
                    pq.add(new Pair(row, col + 1, grid[row][col + 1]));
                else
                    pq.add(new Pair(row, col + 1, time));
            }

            if (col - 1 >= 0 && !vis[row][col - 1]) {
                if (time < grid[row][col - 1])
                    pq.add(new Pair(row, col - 1, grid[row][col - 1]));
                else
                    pq.add(new Pair(row, col - 1, time));
            }
        }
        return -1;
    }
}
