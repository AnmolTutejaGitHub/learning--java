//package Leetcode.1190. Reverse Substrings Between Each Pair of Parentheses;

import java.util.Stack;

class Pair {
    char ch;
    int i;

    Pair(char ch, int i) {
        this.ch = ch;
        this.i = i;
    }
}

class Solution {
    public String reverseParentheses(String s) {
        char[] arr = s.toCharArray();
        Stack<Pair> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == '(')
                st.push(new Pair(arr[i], i));
            else if (arr[i] == ')')
                reverse(arr, st.pop().i + 1, i - 1);
        }

        String str = new String(arr);
        str = str.replace("(", "");
        str = str.replace(")", "");
        return str;
    }

    public void reverse(char[] arr, int s, int e) {
        while (s <= e) {
            char temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
