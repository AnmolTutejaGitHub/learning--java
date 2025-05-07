//package Leetcode.2140. Solving Questions With Brainpower;

class Solution {
    public long mostPoints(int[][] questions) {
        long[]memo = new long[questions.length];
        return memorization(questions,0,memo);
    }

    public long memorization(int [][]questions,int idx,long[]memo){
        if(idx>=questions.length) return 0;
        if(memo[idx]!=0) return memo[idx];


        long skip = memorization(questions,idx+1,memo);
        long solve = questions[idx][0] + memorization(questions,idx+questions[idx][1]+1,memo);

        memo[idx] = Math.max(skip,solve);

        return Math.max(skip,solve);
    }
}

// tabulation
class Solution2 {
    public long mostPoints(int[][]questions){
    int n = questions.length;
    long[] dp = new long[n+1];

    for(int i=n-1;i>=0;i--){
        long notTake = dp[i+1];

        int nextIdx = i+questions[i][1]+1;
        long take = questions[i][0] + (nextIdx < dp.length ? dp[nextIdx] : 0);
        dp[i] = Math.max(take,notTake);
    }
    return dp[0];
}
}
