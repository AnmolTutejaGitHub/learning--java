//package Leetcode.2780. Minimum Index of a Valid Split;

import java.util.List;

class Solution {
    public int minimumIndex(List<Integer> nums) {
        int candidate[] = mooreVoting(nums);
        int freq = 0;
        int n = nums.size();
        for(int i=0;i<nums.size();i++){
            if(nums.get(i)==candidate[0]) freq++;
            if(freq>(i+1)/2 &&(candidate[1]-freq)>(n-i-1)/2) return i;
        }
        return -1;
    }
    public int[] mooreVoting(List<Integer> nums){
        int count = 0;
        int ele = 0;
        for(int i=0;i<nums.size();i++){
            if(count==0){
                ele = nums.get(i);
                count++;
            }
            else if(nums.get(i)==ele) count++;
            else count--;
        }

        count = 0;
        for(int i : nums){
            if(i==ele) count++;
        }
        return new int[]{ele,count};
    }
}
