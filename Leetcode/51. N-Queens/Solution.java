//package Leetcode.51. N-Queens;

import java.util.*;

class Solution {
    public List<List<String>> ans = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];

        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        backtrack(board, 0);
        return ans;
    }

    public void backtrack(char[][] board, int row) {

        if (row >= board.length) {

            List<String> curr = new ArrayList<>();

            for (char[] rows : board) {
                StringBuilder sb = new StringBuilder();
                for (char ch : rows) {
                    sb.append(ch);
                }

                curr.add(sb.toString());
            }

            ans.add(curr);

            return;
        }

        for (int i = 0; i < board[0].length; i++) {
            if (canPlace(row, i, board))
                backtrack(board, row + 1);
            board[row][i] = '.';
        }
    }

    public boolean canPlace(int row, int col, char[][] board) {

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        int orow = row;
        int ocol = col;

        while (row >= 0 && col < board[0].length) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col++;
        }

        row = orow;
        col = ocol;

        while (row < board.length && col < board[0].length) {
            if (board[row][col] == 'Q')
                return false;
            row++;
            col++;
        }

        row = orow;
        col = ocol;

        while (row < board.length && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row++;
            col--;
        }

        row = orow;
        col = ocol;

        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q')
                return false;
            row--;
            col--;
        }

        board[orow][ocol] = 'Q';
        return true;
    }
}