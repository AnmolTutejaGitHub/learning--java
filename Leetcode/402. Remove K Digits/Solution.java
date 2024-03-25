//package Leetcode.402. Remove K Digits;

import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();

        for (char n : num.toCharArray()) {
            while (k > 0 && !st.isEmpty() && st.peek() > n) {
                k--;
                st.pop();
            }

            if (st.isEmpty() && n == '0')
                continue;

            st.push(n);
        }

        for (int i = 0; i < k; i++) {
            if (!st.isEmpty())
                st.pop();
        }

        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append(st.pop());

        String res = sb.reverse().toString();
        if (res.length() == 0)
            return "0";

        return res;
    }
}
