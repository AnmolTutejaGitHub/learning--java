//package Leetcode.994. Rotting Oranges;

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
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 2)
                    q.add(new Pair(i, j));
                if (grid[i][j] == 1)
                    fresh++;
            }
        }

        int min = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rotten = false;
            for (int i = 0; i < size; i++) {
                Pair curr = q.peek();
                int row = curr.row;
                int col = curr.col;

                if (row + 1 < n && grid[row + 1][col] == 1) {
                    grid[row + 1][col] = 2;
                    q.add(new Pair(row + 1, col));
                    rotten = true;
                    fresh--;
                }
                if (row - 1 >= 0 && grid[row - 1][col] == 1) {
                    grid[row - 1][col] = 2;
                    q.add(new Pair(row - 1, col));
                    rotten = true;
                    fresh--;
                }
                if (col + 1 < m && grid[row][col + 1] == 1) {
                    grid[row][col + 1] = 2;
                    q.add(new Pair(row, col + 1));
                    rotten = true;
                    fresh--;
                }
                if (col - 1 >= 0 && grid[row][col - 1] == 1) {
                    grid[row][col - 1] = 2;
                    q.add(new Pair(row, col - 1));
                    rotten = true;
                    fresh--;
                }

                q.poll();
            }
            if (rotten)
                min++;
        }

        if (fresh != 0)
            return -1;
        return min;
    }
}