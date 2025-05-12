//package Leetcode.279. Perfect Squares;

import java.util.*;

class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> ps = new ArrayList<>();
        for(int i=1;i<=n;i++){
            int sqrt = (int)Math.sqrt(i);
            if(sqrt*sqrt==i) ps.add(i);
        }

        int dp[] = new int[n+1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=1;i<dp.length;i++){
            for(int j=0;j<ps.size();j++){
                if(i-ps.get(j)>=0 && dp[i-ps.get(j)]!=Integer.MAX_VALUE) 
                    dp[i] = Math.min(dp[i],dp[i-ps.get(j)]+1);
            }
        }
        return dp[n];
    }
}
