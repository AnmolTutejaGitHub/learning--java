//package Leetcode.3375. Minimum Operations to Make Array Values Equal to K;

class Solution {
    public int minOperations(int[] nums, int k) {
        int map[] = new int[101];
        for(int i=0;i<nums.length;i++){
            map[nums[i]]++;
        }

        int count = 0;
        for(int i=0;i<101;i++){
            if(map[i]>0 && i>k) count++;
            else if(map[i]>0 && i<k) return -1;
        }
        return count;
    }
}