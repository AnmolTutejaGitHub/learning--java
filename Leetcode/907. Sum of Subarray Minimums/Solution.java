//package Leetcode.907. Sum of Subarray Minimums;

import java.util.Stack;

class Solution {
    public int sumSubarrayMins(int[] arr) {

        long M = 1000000007L;
        long sum = 0;

        int[] NSL = getNSL(arr);
        int[] NSR = getNSR(arr);

        for (int i = 0; i < arr.length; i++) {
            long ls = i - NSL[i];
            long rs = NSR[i] - i;

            sum = (sum + (arr[i] * ls * rs)) % M;
        }
        return (int) sum;
    }

    public int[] getNSL(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            if (st.isEmpty())
                result[i] = -1;
            else
                result[i] = st.peek();

            st.push(i);
        }
        return result;
    }

    public int[] getNSR(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> st = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();

            if (st.isEmpty())
                result[i] = arr.length;
            else
                result[i] = st.peek();

            st.push(i);
        }
        return result;
    }
}
