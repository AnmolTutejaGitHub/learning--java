//package Leetcode.2537. Count the Number of Good Subarrays;

import java.util.HashMap;

class Solution {
    public long countGood(int[] nums, int k) {
        int n = nums.length;
        long total_subarrays = (long)n * (n+1)/2;
        return total_subarrays - lessThanK(nums,k);
    }

    public long lessThanK(int []nums,int k){
        int s = 0;
        HashMap<Integer,Integer> freq = new HashMap<>();
        int pair_count=0;
        long res = 0;
        for(int e=0;e<nums.length;e++){
            pair_count += freq.getOrDefault(nums[e],0);
            freq.put(nums[e],freq.getOrDefault(nums[e],0)+1);
            while(pair_count>=k){
                freq.put(nums[s],freq.get(nums[s])-1);
                pair_count-=freq.get(nums[s]);
                s++;
            }
            res+=e-s+1;
        }
        return res;
    }
}
