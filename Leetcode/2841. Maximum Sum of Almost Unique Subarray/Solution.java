// package Leetcode.2841. Maximum Sum of Almost Unique Subarray;
import java.util.*;
class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        int s = 0;
        HashMap<Integer,Integer> map = new HashMap<>();

        long currSum=0;
        long maxSum=0;

        for(int e=0;e<nums.size();e++){
            int curr = nums.get(e);
            map.put(curr,map.getOrDefault(curr,0)+1);
            currSum+=nums.get(e);

            while(e-s+1>k){
                map.put(nums.get(s),map.get(nums.get(s))-1);
                if(map.get(nums.get(s))==0) map.remove(nums.get(s));
                currSum-=nums.get(s);
                s++;
            }
            if(e-s+1==k && map.size()>=m){
                maxSum=Math.max(currSum,maxSum);
            }
        }
        return maxSum;
    }
}