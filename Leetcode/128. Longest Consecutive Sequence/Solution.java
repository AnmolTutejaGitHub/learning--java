//package Leetcode.128. Longest Consecutive Sequence;

import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);

        int max = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                int curr = num;
                int count = 1;
                while(set.contains(curr+count)){
                    count+=1;
                }
                max = Math.max(count,max);
            }
        }
        return max;
    }
}
