//package Leetcode.1482. Minimum Number of Days to Make m Bouquets;

class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if(m*k>bloomDay.length) return -1;

        int max = Integer.MIN_VALUE;
        for(int i : bloomDay){
            max = Math.max(i,max);
        }

        int s = 0;
        int e = max;
        int ans = -1;

        while(s<=e){
            int mid = s+(e-s)/2;

            if(allBouquets(bloomDay,mid,m,k)){
                ans = mid;
                e=mid-1;
            }else s=mid+1;
        }
        return ans;
    }

    public boolean allBouquets(int []arr,int mid,int m,int k){
        int bouquets = 0;
        int flowers = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=mid) flowers++;
            else flowers=0;

            if(flowers==k){
                bouquets++;
                flowers=0;
            }
        }
        return bouquets>=m;
    }
}
