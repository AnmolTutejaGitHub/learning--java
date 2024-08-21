//package Leetcode.37. Sudoku Solver;

class Solution {
    public char[][] res;

    public void solveSudoku(char[][] board) {
        backtrack(board, 0, 0);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = res[i][j];
            }
        }
    }

    public void backtrack(char[][] board, int row, int col) {
        if (row == 9) {
            res = new char[9][9];
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    res[i][j] = board[i][j];
                }
            }
            return;
        }

        if (board[row][col] != '.') {
            if (col < 8)
                backtrack(board, row, col + 1);
            else
                backtrack(board, row + 1, 0);
            return;
        }

        else {

            for (int i = 1; i <= 9; i++) {
                if (canPlace(board, row, col, i)) {
                    if (col < 8)
                        backtrack(board, row, col + 1);
                    else
                        backtrack(board, row + 1, 0);
                    board[row][col] = '.';
                }
            }
        }
    }

    public boolean canPlace(char[][] board, int row, int col, int place) {
        char curr = Character.forDigit(place, 10);

        for (int i = 0; i < 9; i++) {
            if (board[row][i] == curr || board[i][col] == curr)
                return false;
        }

        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == curr)
                    return false;
            }
        }

        board[row][col] = curr;
        return true;
    }
}