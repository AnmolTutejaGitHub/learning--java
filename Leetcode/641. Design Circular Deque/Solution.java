//package Leetcode.641. Design Circular Deque;

class MyCircularDeque {

    public int arr[];
    int size = 0;
    int start = 0;
    int end;
    int k;

    public MyCircularDeque(int k) {
        this.arr = new int[k];
        this.k = k;
        this.end = k - 1;
    }

    public boolean insertFront(int value) {
        if (size == k)
            return false;

        start = (start - 1 + k) % k;
        arr[start] = value;
        size++;
        return true;
    }

    public boolean insertLast(int value) {
        if (size == k)
            return false;

        end = (end + 1) % k;
        arr[end] = value;
        size++;
        return true;
    }

    public boolean deleteFront() {
        if (size == 0)
            return false;
        start = (start + 1) % k;
        size--;
        return true;
    }

    public boolean deleteLast() {
        if (size == 0)
            return false;
        end = (end - 1 + k) % k;
        size--;
        return true;
    }

    public int getFront() {
        if (size == 0)
            return -1;
        return arr[start];
    }

    public int getRear() {
        if (size == 0)
            return -1;
        return arr[end];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == k;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */