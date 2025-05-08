//package Leetcode.1048. Longest String Chain;

import java.util.Arrays;

class Solution {
    public int longestStrChain(String[] words) {
        int n = words.length;
        int dp[] = new int[n];
        Arrays.fill(dp,1);
        int max = 1;

        Arrays.sort(words,(a,b)->a.length()-b.length());

        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(isPredecessor(words[j],words[i])) {
                    dp[i] = Math.max(dp[i],1+dp[j]);
                    max = Math.max(max,dp[i]);
                }
            }
        }

        return max;
    }

    public boolean isPredecessor(String s,String t){
        if(t.length()!=s.length()+1) return false;
        int i = 0;
        int j = 0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)) i++;
            j++;
        }
        return i==s.length();
    }
}
