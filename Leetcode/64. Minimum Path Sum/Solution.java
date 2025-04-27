//package Leetcode.64. Minimum Path Sum;

import java.util.Arrays;

class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int dp[][] = new int[n][m];
        for(int [] row : dp){
            Arrays.fill(row,Integer.MAX_VALUE);
        }
        dp[0][0] = grid[0][0];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0 && j==0) continue;
                if(i-1>=0) dp[i][j] = dp[i-1][j];
                if(j-1>=0) dp[i][j] = Math.min(dp[i][j],dp[i][j-1]);
                dp[i][j] += grid[i][j];
            }
        }
        return dp[n-1][m-1];
    }
}
