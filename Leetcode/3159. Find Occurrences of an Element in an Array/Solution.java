//package Leetcode.3159. Find Occurrences of an Element in an Array;

import java.util.HashMap;

class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int count = 0;
        int res[] = new int[queries.length];
        HashMap<Integer, Integer> map = new HashMap<>(); // occurence,index
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == x) {
                count++;
                map.put(count, i);
            }
        }

        for (int i = 0; i < queries.length; i++) {
            if (map.containsKey(queries[i]))
                res[i] = map.get(queries[i]);
            else
                res[i] = -1;
        }

        return res;
    }
}
