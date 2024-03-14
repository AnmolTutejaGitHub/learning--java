//package Leetcode.2696. Minimum String Length After Removing Substrings;

import java.util.Stack;

class Solution {
    public int minLength(String s) {
        int res = 0;
        Stack<Character> stack = new Stack<>();
        for (char ele : s.toCharArray()) {
            if (!stack.isEmpty() && ele == 'B' && stack.peek() == 'A') {
                stack.pop();
                res--;
            } else if (!stack.isEmpty() && ele == 'D' && stack.peek() == 'C') {
                stack.pop();
                res--;
            } else {
                res++;
                stack.push(ele);
            }
        }

        return res;
    }
}
