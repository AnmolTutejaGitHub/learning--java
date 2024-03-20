//package Leetcode.150. Evaluate Reverse Polish Notation;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> val = new Stack<>();
        int v1;
        int v2;

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                v2 = val.pop();
                v1 = val.pop();
                val.push(v1 + v2);
            } else if (tokens[i].equals("-")) {
                v2 = val.pop();
                v1 = val.pop();
                val.push(v1 - v2);
            } else if (tokens[i].equals("*")) {
                v2 = val.pop();
                v1 = val.pop();
                val.push(v1 * v2);
            } else if (tokens[i].equals("/")) {
                v2 = val.pop();
                v1 = val.pop();
                val.push(v1 / v2);
            } else
                val.push(Integer.parseInt(tokens[i]));
        }
        return val.peek();
    }
}
