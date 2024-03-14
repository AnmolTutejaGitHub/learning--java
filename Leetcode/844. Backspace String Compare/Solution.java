//package Leetcode.844. Backspace String Compare;

import java.util.Stack;

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> s_ = new Stack<>();
        Stack<Character> t_ = new Stack<>();

        for (char ele : s.toCharArray()) {
            if (!s_.isEmpty() && ele == '#') {
                s_.pop();
            } else if (s_.isEmpty() && ele == '#')
                continue;
            else
                s_.push(ele);
        }

        for (char ele : t.toCharArray()) {
            if (!t_.isEmpty() && ele == '#') {
                t_.pop();
            } else if (t_.isEmpty() && ele == '#')
                continue;
            else
                t_.push(ele);
        }

        StringBuilder s__ = new StringBuilder();
        StringBuilder t__ = new StringBuilder();
        while (!s_.isEmpty())
            s__.append(s_.pop());
        while (!t_.isEmpty())
            t__.append(t_.pop());

        return s__.toString().equals(t__.toString());
    }
}
