//package Leetcode.2744. Find Maximum Number of String Pairs;

import java.util.HashSet;

class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        HashSet<String> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (set.contains(reverse(words[i])))
                count++;
            set.add(words[i]);
        }
        return count;
    }

    public String reverse(String s) {
        char[] arr = s.toCharArray();
        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            char temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

            l++;
            r--;
        }

        return new String(arr);
    }
}
