//package Leetcode.525. Contiguous Array;

import java.util.HashMap;

class Solution {
    public int findMaxLength(int[] nums) {
        int prefixSum = 0;
        int largest = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                prefixSum -= 1;
            if (nums[i] == 1)
                prefixSum += 1;
            if (prefixSum != 0 && map.containsKey(prefixSum)) {
                largest = Math.max(largest, i - map.getOrDefault(prefixSum, 0));
                continue;
            }
            if (prefixSum == 0)
                largest = Math.max(largest, i + 1);
            map.put(prefixSum, i);
        }

        return largest;

    }
}
