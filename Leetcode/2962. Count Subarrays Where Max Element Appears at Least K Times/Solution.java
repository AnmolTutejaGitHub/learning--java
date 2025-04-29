//package Leetcode.2962. Count Subarrays Where Max Element Appears at Least K Times;

class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long total_Subarrays = (long)n*(n+1)/2;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max = Math.max(max,nums[i]);
        }
        return total_Subarrays-lessThan(nums,k,max);
    }

    public long lessThan(int[]nums,int k,int max){
        int n = nums.length;
        int s = 0;
        int freq = 0;
        long count = 0;

        for(int e=0;e<n;e++){
            if(nums[e]==max) freq++;
            while(s<=e && freq>=k){
                if(nums[s]==max) freq--;
                s++;
            }
            count+=(e-s+1);
        }
        return count;
    }
}
