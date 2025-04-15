//package Leetcode.875. Koko Eating Bananas;
// https://leetcode.com/problems/koko-eating-bananas/description/
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
       int max = Integer.MIN_VALUE;

        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }

        int s = 1;
        int e = max;
        int ans = -1;
        while(s<=e){
            int m = s+(e-s)/2;
            int total_hours = totalHours(piles,m);
            if(total_hours<=h){
                ans = m;
                e = m-1;
            }
            else s = m+1;
        }
        return ans;
    }

    public int totalHours(int []piles,int k){
        int total = 0;
        for(int i=0;i<piles.length;i++){
            total+=Math.ceil((double)piles[i]/(double)k);
        }
        return total;
    }
}