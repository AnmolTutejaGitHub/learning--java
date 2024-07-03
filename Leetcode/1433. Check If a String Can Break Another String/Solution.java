//package Leetcode.1433. Check If a String Can Break Another String;

import java.util.Arrays;

class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        s1 = sort(s1);
        s2 = sort(s2);
        return canbreak(s1, s2) || canbreak(s2, s1);
    }

    public boolean canbreak(String x, String y) {
        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) < y.charAt(i))
                return false;
        }
        return true;
    }

    public String sort(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
