//package Leetcode.52. N-Queens II;

class Solution {
    public int ans = 0;

    public int totalNQueens(int n) {

        int[][] board = new int[n][n];
        backtrack(0, board, 0);

        return ans;
    }

    public void backtrack(int row, int[][] board, int placed) {
        if (row >= board.length) {
            if (placed == board.length)
                ans++;
            return;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (canPlace(board, row, i))
                backtrack(row + 1, board, placed + 1);
            board[row][i] = 0;
        }
    }

    public boolean canPlace(int[][] board, int row, int col) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 1)
                return false;
        }

        int orow = row;
        int ocol = col;

        while (row >= 0 && col < board[0].length) {
            if (board[row][col] == 1)
                return false;
            row--;
            col++;
        }

        row = orow;
        col = ocol;

        while (row < board.length && col < board[0].length) {
            if (board[row][col] == 1)
                return false;
            row++;
            col++;
        }

        row = orow;
        col = ocol;

        while (row < board.length && col >= 0) {
            if (board[row][col] == 1)
                return false;
            row++;
            col--;
        }

        row = orow;
        col = ocol;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 1)
                return false;
            row--;
            col--;
        }

        board[orow][ocol] = 1;
        return true;
    }
}
