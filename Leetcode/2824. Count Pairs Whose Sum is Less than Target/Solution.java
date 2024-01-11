//package Leetcode.2824. Count Pairs Whose Sum is Less than Target;

import java.util.List;

class Solution {
    public int countPairs(List<Integer> nums, int target) {

        // problem faced toArray method only takes object so used Integer wrapper class
        // instead of int
        Integer arr[] = nums.toArray(new Integer[nums.size()]);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] < target)
                    count++;
            }
        }
        return count;
    }
}
