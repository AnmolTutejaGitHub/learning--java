//package Leetcode.1381. Design a Stack With Increment Operation;

class CustomStack {
    int maxSize = 0;
    int top = 0;
    int stack[] = new int[1];

    public CustomStack(int maxSize) {
        this.maxSize = maxSize;
        int st[] = new int[maxSize];
        stack = st;
    }

    public void push(int x) {
        if (top == maxSize)
            return;
        stack[top++] = x;
    }

    public int pop() {
        if (top == 0)
            return -1;
        int del = stack[top - 1];
        stack[--top] = 0;
        return del;
    }

    public void increment(int k, int val) {
        int len = Math.min(k, top);
        for (int i = 0; i < len; i++)
            stack[i] += val;
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
