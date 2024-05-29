//package Leetcode.2053. Kth Distinct String in an Array;

import java.util.LinkedHashMap;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int count = 0;
        for (String s : arr) {
            if (map.get(s) == 1)
                count++;
            if (count == k)
                return s;
        }

        return "";
    }
}
