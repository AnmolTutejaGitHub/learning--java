//package Leetcode.3396. Minimum Number of Operations to Make Elements in Array Distinct;

import java.util.HashMap;

class Solution {
    public int minimumOperations(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        int count = 0;
        for(int i=0;i<nums.length;i+=3){
            if(map.size()==nums.length-i) break;

            map.put(nums[i],map.getOrDefault(nums[i],0)-1);
            if(i+1<nums.length) map.put(nums[i+1],map.getOrDefault(nums[i+1],0)-1);
            if(i+2<nums.length) map.put(nums[i+2],map.getOrDefault(nums[i+2],0)-1);

            if(map.get(nums[i])==0) map.remove(nums[i]);
            if(i+1<nums.length && map.containsKey(nums[i+1]) 
            && map.get(nums[i+1])==0) map.remove(nums[i+1]);

            if(i+2<nums.length && map.containsKey(nums[i+2]) 
            && map.get(nums[i+2])==0) map.remove(nums[i+2]);

            count++;
        }
        return count;
    }
}