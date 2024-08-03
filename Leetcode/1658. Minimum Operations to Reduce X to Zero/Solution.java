//package Leetcode.1658. Minimum Operations to Reduce X to Zero;

import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums, int x) {
        long sum = 0;
        for (int i : nums)
            sum += i;
        sum -= x;
        if (sum == 0)
            return nums.length;

        long prefix = 0;
        int maxLen = 0;
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(0L, -1);
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            if (map.containsKey(prefix - sum)) {
                maxLen = Math.max(maxLen, i - map.get(prefix - sum));
            }
            if (!map.containsKey(prefix))
                map.put(prefix, i);
        }
        if (maxLen == 0)
            return -1;
        return nums.length - maxLen;
    }
}
