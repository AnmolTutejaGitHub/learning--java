//package Leetcode.1631. Path With Minimum Effort;

import java.util.*;

class Pair {
    int row;
    int col;
    int diff;

    Pair(int row, int col, int diff) {
        this.row = row;
        this.col = col;
        this.diff = diff;
    }

}

class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;
        PriorityQueue<Pair> pq = new PriorityQueue<>((p1, p2) -> p1.diff - p2.diff);
        boolean vis[][] = new boolean[n][m];
        int res = Integer.MAX_VALUE;

        pq.add(new Pair(0, 0, 0));
        while (!pq.isEmpty()) {
            int row = pq.peek().row;
            int col = pq.peek().col;
            int diff = pq.peek().diff;
            vis[row][col] = true;
            pq.poll();

            if (row == n - 1 && col == m - 1)
                res = Math.min(res, diff);

            if (row + 1 < n && !vis[row + 1][col]) {
                pq.add(new Pair(row + 1, col, Math.max(diff, Math.abs(heights[row][col] - heights[row + 1][col]))));
            }

            if (row - 1 >= 0 && !vis[row - 1][col]) {
                pq.add(new Pair(row - 1, col, Math.max(diff, Math.abs(heights[row][col] - heights[row - 1][col]))));
            }

            if (col + 1 < m && !vis[row][col + 1]) {
                pq.add(new Pair(row, col + 1, Math.max(diff, Math.abs(heights[row][col] - heights[row][col + 1]))));
            }

            if (col - 1 >= 0 && !vis[row][col - 1]) {
                pq.add(new Pair(row, col - 1, Math.max(diff, Math.abs(heights[row][col] - heights[row][col - 1]))));
            }

        }
        return res;
    }
}
