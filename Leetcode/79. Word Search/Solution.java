//package Leetcode.79. Word Search;

class Solution {
    public boolean exist(char[][] board, String word) {
        boolean found[] = new boolean[1];
        boolean vis[][] = new boolean[board.length][board[0].length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == word.charAt(0))
                    backtrack(0, i, j, board, word, found, "", vis);
                if (found[0] == true)
                    return true;
            }
        }
        return false;
    }

    public void backtrack(int idx, int row, int col, char[][] board, String word, boolean[] found, String p,
            boolean[][] vis) {
        if (p.equals(word)) {
            found[0] = true;
            return;
        }

        if (idx >= word.length() || row >= board.length || row < 0 || col >= board[0].length || col < 0
                || vis[row][col])
            return;

        vis[row][col] = true;

        if (board[row][col] == word.charAt(idx)) {
            backtrack(idx + 1, row + 1, col, board, word, found, p + word.charAt(idx), vis);
            backtrack(idx + 1, row - 1, col, board, word, found, p + word.charAt(idx), vis);
            backtrack(idx + 1, row, col + 1, board, word, found, p + word.charAt(idx), vis);
            backtrack(idx + 1, row, col - 1, board, word, found, p + word.charAt(idx), vis);

        }

        vis[row][col] = false;
    }
}
