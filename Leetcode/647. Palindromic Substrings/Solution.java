//package Leetcode.647. Palindromic Substrings;

class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        int count = 0;

        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                if(j==i) dp[i][j] = true;
                else if(j==i+1) dp[i][j] = s.charAt(i)==s.charAt(j);
                else if(s.charAt(i)==s.charAt(j)) dp[i][j] = dp[i+1][j-1];

                if(dp[i][j]==true) count++;
            }
        }
        return count;
    }
    
}
