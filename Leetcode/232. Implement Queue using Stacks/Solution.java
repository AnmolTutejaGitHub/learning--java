//package Leetcode.232. Implement Queue using Stacks;

import java.util.Stack;

class MyQueue {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();

    public MyQueue() {

    }

    public void push(int x) {
        st.push(x);
    }

    public int pop() {
        while (st.size() != 1) {
            helper.push(st.pop());
        }
        int data = st.pop();

        while (!helper.isEmpty())
            st.push(helper.pop());

        return data;
    }

    public int peek() {
        while (st.size() != 1) {
            helper.push(st.pop());
        }
        int data = st.peek();

        while (!helper.isEmpty())
            st.push(helper.pop());

        return data;
    }

    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
