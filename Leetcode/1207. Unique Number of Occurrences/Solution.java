//package Leetcode.1207. Unique Number of Occurrences;

import java.util.HashMap;

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int freqs = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    freqs++;
            }
            freq.put(arr[i], freqs);
        }

        for (int ele : freq.values()) {
            int count = 0; // wanna keep track of first occurence
            boolean flag = true;
            for (int i : freq.values()) {
                if (i == ele) {
                    flag = false;
                    count++;
                }
            }
            if (!flag && count > 1)
                return false;
        }

        return true;
    }
}
