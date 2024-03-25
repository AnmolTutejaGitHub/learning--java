//package Leetcode.503. Next Greater Element II;

import java.util.Stack;

class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int res[] = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * nums.length - 2; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i % nums.length])
                st.pop();

            if (st.isEmpty())
                res[i % nums.length] = -1;
            else
                res[i % nums.length] = st.peek();

            st.push(nums[i % nums.length]);
        }
        return res;
    }
}
