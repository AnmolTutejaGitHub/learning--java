//package Leetcode.1717. Maximum Score From Removing Substrings;

import java.util.*;

class Solution {
    public int maximumGain(String s, int x, int y) {
        Stack<Character> st = new Stack<>();
        int points = 0;
        int max = x > y ? x : y;
        String maxStr = max == x ? "ab" : "ba";
        int min = max == x ? y : x;
        String minStr = min == y ? "ba" : "ab";

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (!st.isEmpty() && st.peek() == maxStr.charAt(0) && curr == maxStr.charAt(1)) {
                points += max;
                st.pop();
            } else
                st.push(curr);
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());

        sb = sb.reverse();

        for (int i = 0; i < sb.length(); i++) {
            char curr = sb.charAt(i);
            if (!st.isEmpty() && st.peek() == minStr.charAt(0) && curr == minStr.charAt(1)) {
                points += min;
                st.pop();
            } else
                st.push(curr);
        }

        return points;
    }
}
