//package Leetcode.1668. Maximum Repeating Substring;

class Solution {
    public int maxRepeating(String sequence, String word) {
        int n = sequence.length();
        int m = word.length();
        int dp[] = new int[n+1];
        int max = 0;
        for(int i=m;i<=n;i++){
            if(sequence.substring(i-m,i).equals(word)){
                dp[i] = dp[i-m]+1;
                max = Math.max(max,dp[i]);
            }
        }
        return max;
    }
}
