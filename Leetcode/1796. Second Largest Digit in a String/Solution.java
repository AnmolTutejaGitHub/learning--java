//package Leetcode.1796. Second Largest Digit in a String;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int secondHighest(String s) {
        Set<Integer> ans = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0' || s.charAt(i) == '1' || s.charAt(i) == '2' || s.charAt(i) == '3'
                    || s.charAt(i) == '4' || s.charAt(i) == '5' || s.charAt(i) == '6' || s.charAt(i) == '7'
                    || s.charAt(i) == '8' || s.charAt(i) == '9')
                ans.add(Integer.parseInt("" + s.charAt(i)));
        }

        int max = Integer.MIN_VALUE;
        int scMax = Integer.MIN_VALUE;
        for (int ele : ans) {
            if (max < ele) {
                scMax = max;
                max = ele;
            } else if (scMax < ele)
                scMax = ele;

        }
        return scMax == Integer.MIN_VALUE ? -1 : scMax;
    }
}