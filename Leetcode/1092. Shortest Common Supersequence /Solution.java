//package Leetcode.1092. Shortest Common Supersequence ;

class Solution {
    public String shortestCommonSupersequence(String str1, String str2) {
        String lcs = longestCommonSubsequence(str1,str2);
        // String concat = str1+str2;
        // return concat.replaceFirst(lcs,"");
        StringBuilder res = new StringBuilder();

        int i = 0;
        int j = 0;
        for (char ch : lcs.toCharArray()) {
            while (i<str1.length() && str1.charAt(i)!= ch) res.append(str1.charAt(i++));
    
            while (j < str2.length() && str2.charAt(j)!=ch) res.append(str2.charAt(j++));

            res.append(ch);
            i++;
            j++;
        }

        res.append(str1.substring(i,str1.length()));
        res.append(str2.substring(j,str2.length()));

        return res.toString();
    }

    public String longestCommonSubsequence(String str1,String str2){
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n+1][m+1];

        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)) dp[i][j] = 1+dp[i-1][j-1];
                dp[i][j] = Math.max(dp[i][j],dp[i-1][j]);
                dp[i][j] = Math.max(dp[i][j],dp[i][j-1]);
            }
        }

        int i = n;
        int j = m;
        StringBuilder sb = new StringBuilder();
        while(i>0 && j>0){
            if(str1.charAt(i-1)==str2.charAt(j-1)) {
                sb.append(str1.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]) i--;
            else j--;
        }
        return sb.reverse().toString();
    }
}
