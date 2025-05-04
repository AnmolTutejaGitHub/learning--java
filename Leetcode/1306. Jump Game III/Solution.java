//package Leetcode.1306. Jump Game III;

class DP{
    boolean visited = false;
    boolean dp = false;
    DP(boolean vis,boolean dp){
        this.visited = vis;
        this.dp = dp;
    }
}
class Solution {
    public boolean canReach(int[] arr, int start) {
        DP dp[] = new DP[arr.length];
        return BFS(arr,start,dp);
    }
    public boolean BFS(int [] arr, int idx,DP[]dp){
        if(idx<0 || idx>=arr.length) return false;
        if(dp[idx] != null && dp[idx].visited) return dp[idx].dp;
        if(arr[idx]==0) {
            dp[idx] = new DP(true, true);
            return true;
        }

        dp[idx] = new DP(true,false);
        boolean l = BFS(arr,idx-arr[idx],dp);
        boolean r = BFS(arr,idx+arr[idx],dp);

        dp[idx] = new DP(true,l || r);

        return l || r;
    }
}