//package Leetcode.1926. Nearest Exit from Entrance in Maze;

import java.util.*;

class Pair {
    int row;
    int col;
    int steps;

    Pair(int row, int col, int steps) {
        this.row = row;
        this.col = col;
        this.steps = steps;
    }
}

class Solution {
    public int nearestExit(char[][] maze, int[] entrance) {
        int n = maze.length;
        int m = maze[0].length;

        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.steps - p2.steps);
        boolean vis[][] = new boolean[n][m];
        int dis[][] = new int[n][m];
        for (int[] row : dis) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        pq.add(new Pair(entrance[0], entrance[1], 0));
        while (!pq.isEmpty()) {
            Pair curr = pq.poll();
            int row = curr.row;
            int col = curr.col;
            int steps = curr.steps;
            vis[row][col] = true;
            if (dis[row][col] < steps)
                continue;
            if ((row + 1 >= n || col + 1 >= m || row - 1 < 0 || col - 1 < 0) && steps != 0)
                return steps;

            if (row + 1 < n && maze[row + 1][col] == '.' && !vis[row + 1][col]) {
                if (dis[row + 1][col] > steps + 1) {
                    dis[row + 1][col] = steps + 1;
                    pq.add(new Pair(row + 1, col, steps + 1));
                }
            }

            if (row - 1 >= 0 && maze[row - 1][col] == '.' && !vis[row - 1][col]) {
                if (dis[row - 1][col] > steps + 1) {
                    dis[row - 1][col] = steps + 1;
                    pq.add(new Pair(row - 1, col, steps + 1));
                }
            }
            if (col + 1 < m && maze[row][col + 1] == '.' && !vis[row][col + 1]) {
                if (dis[row][col + 1] > steps + 1) {
                    dis[row][col + 1] = steps + 1;
                    pq.add(new Pair(row, col + 1, steps + 1));
                }
            }
            if (col - 1 >= 0 && maze[row][col - 1] == '.' && !vis[row][col - 1]) {
                if (dis[row][col - 1] > steps + 1) {
                    dis[row][col - 1] = steps + 1;
                    pq.add(new Pair(row, col - 1, steps + 1));
                }
            }

        }
        return -1;
    }
}
