//package Leetcode.130. Surrounded Regions;

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
    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;
        boolean[][] vis = new boolean[n][m];
        Queue<Pair> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == m - 1) {
                    if (board[i][j] == 'O') {
                        q.add(new Pair(i, j));
                        vis[i][j] = true;
                    }
                }
            }
        }

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            int row = curr.row;
            int col = curr.col;
            vis[row][col] = true;

            if (row + 1 < n && !vis[row + 1][col] && board[row + 1][col] == 'O')
                q.add(new Pair(row + 1, col));
            if (row - 1 >= 0 && !vis[row - 1][col] && board[row - 1][col] == 'O')
                q.add(new Pair(row - 1, col));
            if (col + 1 < m && !vis[row][col + 1] && board[row][col + 1] == 'O')
                q.add(new Pair(row, col + 1));
            if (col - 1 >= 0 && !vis[row][col - 1] && board[row][col - 1] == 'O')
                q.add(new Pair(row, col - 1));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (!vis[i][j] && board[i][j] == 'O')
                    board[i][j] = 'X';
            }
        }

    }
}

// passed 53/58 test cases but not worked so tried bfs approach

// class Solution {
// public void solve(char[][] board) {
// int n = board.length;
// int m = board[0].length;
// boolean isBoundary[] = new boolean[1];
// boolean vis[][] = new boolean[n][m];

// for(int i=0;i<n;i++){
// for(int j=0;j<m;j++){
// isBoundary[0]=false;
// if(!vis[i][j] && board[i][j]=='O'){
// dfs(board,i,j,vis,isBoundary);
// }
// }
// }

// }

// public void dfs(char[][]board,int row,int col,boolean
// vis[][],boolean[]isBoundary){
// int n = board.length;
// int m = board[0].length;

// vis[row][col]=true;

// if(row+1>=n || row-1<0 || col+1>=m || col-1<0) isBoundary[0]=true;

// if(row+1<n && !vis[row+1][col] && board[row+1][col]=='O')
// dfs(board,row+1,col,vis,isBoundary);
// if(row-1>=0 && !vis[row-1][col] && board[row-1][col]=='O')
// dfs(board,row-1,col,vis,isBoundary);
// if(col+1<m && !vis[row][col+1] && board[row][col+1]=='O')
// dfs(board,row,col+1,vis,isBoundary);
// if(col-1>=0 &&!vis[row][col-1] && board[row][col-1]=='O')
// dfs(board,row,col-1,vis,isBoundary);

// if(!isBoundary[0]) board[row][col]='X';
// }
// }