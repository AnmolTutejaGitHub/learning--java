//package Leetcode.733. Flood Fill;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int n = image.length;
        int m = image[0].length;
        int initial = image[sr][sc];
        boolean vis[][] = new boolean[n][m];

        dfs(image, sr, sc, color, initial, vis);
        return image;
    }

    public void dfs(int[][] image, int row, int col, int color, int initial, boolean[][] vis) {
        int n = image.length;
        int m = image[0].length;
        vis[row][col] = true;
        image[row][col] = color;

        if (row + 1 < n && !vis[row + 1][col] && image[row + 1][col] == initial)
            dfs(image, row + 1, col, color, initial, vis);
        if (row - 1 >= 0 && !vis[row - 1][col] && image[row - 1][col] == initial)
            dfs(image, row - 1, col, color, initial, vis);
        if (col + 1 < m && !vis[row][col + 1] && image[row][col + 1] == initial)
            dfs(image, row, col + 1, color, initial, vis);
        if (col - 1 >= 0 && !vis[row][col - 1] && image[row][col - 1] == initial)
            dfs(image, row, col - 1, color, initial, vis);
    }
}
