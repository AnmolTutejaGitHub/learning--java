//package Leetcode.712. Minimum ASCII Delete Sum for Two Strings;

class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int totalASCII = 0;
        for(char ch : s1.toCharArray()) totalASCII+=ch;
        for(char ch : s2.toCharArray()) totalASCII+=ch;

        return totalASCII - 2*longest_common_sequence_ASCII(s1,s2);
    }

    public int longest_common_sequence_ASCII(String s1,String s2){
        int n = s1.length();
        int m = s2.length();
        int dp[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j] = s1.charAt(i-1)+dp[i-1][j-1];
                dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                dp[i][j] = Math.max(dp[i][j],dp[i][j-1]);
            }
        }
        return dp[n][m];
    }
}
