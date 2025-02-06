//package Leetcode.1726. Tuple with Same Product;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int prod = nums[i] * nums[j];
                map.put(prod, map.getOrDefault(prod, 0) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int val = entry.getValue();
            if (val > 1) {
                count += nc2(val) * 8;
            }
        }
        return count;
    }

    public static int nc2(int n) {
        return (n * (n - 1)) / 2;
    }

}