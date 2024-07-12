//package Leetcode.36. Valid Sudoku;

import java.util.*;

class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] arr = new HashSet[27]; // 0-8 rows,9-17 cols
        HashSet<Character>[][] box = new HashSet[3][3];

        for (int i = 0; i < 18; i++) {
            arr[i] = new HashSet<Character>();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                box[i][j] = new HashSet<Character>();
            }
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.')
                    continue;
                if (arr[i].contains(board[i][j]))
                    return false;
                arr[i].add(board[i][j]);

                if (arr[j + 9].contains(board[i][j]))
                    return false;
                arr[j + 9].add(board[i][j]);

                if (box[i / 3][j / 3].contains(board[i][j]))
                    return false;
                box[i / 3][j / 3].add(board[i][j]);
            }
        }

        return true;
    }
}
