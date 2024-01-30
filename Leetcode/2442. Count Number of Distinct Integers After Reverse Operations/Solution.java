//package Leetcode.2442. Count Number of Distinct Integers After Reverse Operations;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            ans.add(nums[i]);
            ans.add(reverse(nums[i]));
        }
        // int count =0;
        // for(int ele : ans){
        // count++;
        // }
        // return count;
        return ans.size();

    }

    static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        return rev;
    }
}