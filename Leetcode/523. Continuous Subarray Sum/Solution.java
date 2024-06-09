//package Leetcode.523. Continuous Subarray Sum;

import java.util.HashMap;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();// rem,index
        map.put(0, -1);
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            int rem = prefixSum % k;
            if (rem < 0)
                rem += k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) >= 2)
                    return true;
            } else
                map.put(rem, i);
        }
        return false;
    }
}
