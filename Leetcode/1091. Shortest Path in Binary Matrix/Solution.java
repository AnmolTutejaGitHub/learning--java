//package Leetcode.1091. Shortest Path in Binary Matrix;

import java.util.*;

class Pair {
    int row;
    int col;
    int dist;

    Pair(int row, int col, int dist) {
        this.row = row;
        this.col = col;
        this.dist = dist;
    }
}

class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] dis = new int[n][m];
        for (int[] row : dis) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        boolean[][] vis = new boolean[n][m];
        if (grid[0][0] != 0 || grid[n - 1][n - 1] != 0)
            return -1;
        if (n - 1 == 0)
            return 1;

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.dist - p2.dist);
        pq.add(new Pair(0, 0, 0));
        while (!pq.isEmpty()) {
            int row = pq.peek().row;
            int col = pq.peek().col;
            int dist = pq.peek().dist;
            pq.poll();
            vis[row][col] = true;
            if (row == n - 1 && col == n - 1)
                return dis[row][col] + 1;
            if (dis[row][col] < dist)
                continue;

            if (row + 1 < n && !vis[row + 1][col] && grid[row + 1][col] == 0 && dist + 1 < dis[row + 1][col]) {
                dis[row + 1][col] = dist + 1;
                pq.add(new Pair(row + 1, col, dist + 1));
            }

            if (row - 1 >= 0 && !vis[row - 1][col] && grid[row - 1][col] == 0 && dist + 1 < dis[row - 1][col]) {
                dis[row - 1][col] = dist + 1;
                pq.add(new Pair(row - 1, col, dist + 1));
            }

            if (col + 1 < m && !vis[row][col + 1] && grid[row][col + 1] == 0 && dist + 1 < dis[row][col + 1]) {
                dis[row][col + 1] = dist + 1;
                pq.add(new Pair(row, col + 1, dist + 1));
            }

            if (col - 1 >= 0 && !vis[row][col - 1] && grid[row][col - 1] == 0 && dist + 1 < dis[row][col - 1]) {
                dis[row][col - 1] = dist + 1;
                pq.add(new Pair(row, col - 1, dist + 1));
            }

            if (row + 1 < n && col + 1 < m && !vis[row + 1][col + 1] && grid[row + 1][col + 1] == 0
                    && dist + 1 < dis[row + 1][col + 1]) {
                dis[row + 1][col + 1] = dist + 1;
                pq.add(new Pair(row + 1, col + 1, dist + 1));
            }

            if (row + 1 < n && col - 1 >= 0 && !vis[row + 1][col - 1] && grid[row + 1][col - 1] == 0
                    && dist + 1 < dis[row + 1][col - 1]) {
                dis[row + 1][col - 1] = dist + 1;
                pq.add(new Pair(row + 1, col - 1, dist + 1));
            }

            if (row - 1 >= 0 && col + 1 < m && !vis[row - 1][col + 1] && grid[row - 1][col + 1] == 0
                    && dist + 1 < dis[row - 1][col + 1]) {
                dis[row - 1][col + 1] = dist + 1;
                pq.add(new Pair(row - 1, col + 1, dist + 1));
            }

            if (row - 1 >= 0 && col - 1 >= 0 && !vis[row - 1][col - 1] && grid[row - 1][col - 1] == 0
                    && dist + 1 < dis[row - 1][col - 1]) {
                dis[row - 1][col - 1] = dist + 1;
                pq.add(new Pair(row - 1, col - 1, dist + 1));
            }

        }
        return -1;
    }
}
