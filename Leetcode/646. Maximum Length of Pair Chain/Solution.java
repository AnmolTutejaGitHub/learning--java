//package Leetcode.646. Maximum Length of Pair Chain;
import java.util.*;
class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0]-b[0]);
        int dp[] = new int[pairs.length];
        Arrays.fill(dp,1);
        int res = 0;
        for(int i=0;i<pairs.length;i++){
            int max = 0;
            for(int j=i-1;j>=0;j--){
                if(pairs[j][1]<pairs[i][0]){
                    max = Math.max(max,dp[j]);
                }
            }
            dp[i] = max+1;
            res = Math.max(res,dp[i]);
        }
        return res;
    }
}
