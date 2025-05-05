//package Leetcode.63. Unique Paths II;

class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        int m = obstacleGrid[0].length;

        int dp[][] = new int[n+1][m+1];
        dp[1][1] = 1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 && j==1) continue;
                int a = dp[i][j-1];
                if(j-2>=0 && obstacleGrid[i-1][j-2]==1) a = 0;
                int b = dp[i-1][j];
                if(i-2>=0 && obstacleGrid[i-2][j-1]==1) b = 0;
                dp[i][j] =  a + b;
            }
        }
        if(obstacleGrid[n-1][m-1]==1) return 0;
        return dp[n][m];
    }
}
