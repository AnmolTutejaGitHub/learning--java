//package Leetcode.419. Battleships in a Board;

class Solution {
    public int countBattleships(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        int count = 0;
        boolean[][] vis = new boolean[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && board[i][j] == 'X') {
                    dfs(i, j, vis, board, n, m);
                    count++;
                }
            }
        }
        return count;
    }

    public void dfs(int row, int col, boolean[][] vis, char[][] board, int n, int m) {
        vis[row][col] = true;

        if (row + 1 < n && !vis[row + 1][col] && board[row + 1][col] == 'X')
            dfs(row + 1, col, vis, board, n, m);
        if (row - 1 >= 0 && !vis[row - 1][col] && board[row - 1][col] == 'X')
            dfs(row - 1, col, vis, board, n, m);
        if (col + 1 < m && !vis[row][col + 1] && board[row][col + 1] == 'X')
            dfs(row, col + 1, vis, board, n, m);
        if (col - 1 >= 0 && !vis[row][col - 1] && board[row][col - 1] == 'X')
            dfs(row, col - 1, vis, board, n, m);
    }
}
