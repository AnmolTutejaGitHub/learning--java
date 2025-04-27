//package Leetcode.3392. Count Subarrays of Length Three With a Condition;

class Solution {
    public int countSubarrays(int[] nums) {
        int s = 0;
        int count = 0;
        for(int e=0;e<nums.length;e++){
            if(e-s+1>3) s++;

            if(e-s+1==3 && 2*(nums[s]+nums[e])==nums[s+1]){count++;}
        }
        return count;
    }
}
