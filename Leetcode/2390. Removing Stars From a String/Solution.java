//package Leetcode.2390. Removing Stars From a String;

import java.util.Stack;

class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '*')
                st.pop();
            else
                st.push(ch);
        }

        StringBuilder res = new StringBuilder();
        while (!st.isEmpty())
            res.append(st.pop());

        return res.reverse().toString();
    }
}
