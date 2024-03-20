//package Leetcode.739. Daily Temperatures;

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (stack.isEmpty())
                ans[i] = 0;
            else if (temperatures[i] < temperatures[stack.peek()]) {
                ans[i] = stack.peek() - i;
            } else {
                while (!stack.isEmpty() && temperatures[i] >= temperatures[stack.peek()]) {
                    stack.pop();
                }
                if (stack.isEmpty())
                    ans[i] = 0;
                else
                    ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}
