//package Leetcode.931. Minimum Falling Path Sum;

class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;

        int dp[][] = new int[n][m];
        for (int i = 0; i < m; i++) {
            dp[0][i] = matrix[0][i];
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0) continue;

                int a = Integer.MAX_VALUE;
                int b = Integer.MAX_VALUE;
                int c = Integer.MAX_VALUE;

                if(i-1>=0 && j+1<m) a = dp[i-1][j+1];
                if(i-1>=0) b = dp[i-1][j];
                if(i-1>=0 && j-1>=0) c = dp[i-1][j-1];

                dp[i][j] = Math.min(a,Math.min(b,c)) + matrix[i][j];
            }
        }

        int min = Integer.MAX_VALUE;

        for(int i=0;i<m;i++){
            min = Math.min(min,dp[n-1][i]);
        }
        return min;
    }
}
