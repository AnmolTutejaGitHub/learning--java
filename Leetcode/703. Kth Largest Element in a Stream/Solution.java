//package Leetcode.703. Kth Largest Element in a Stream;

import java.util.PriorityQueue;

class KthLargest {

    PriorityQueue<Integer> pq;
    int K = 0;

    public KthLargest(int k, int[] nums) {
        this.pq = new PriorityQueue<>();
        for (int i : nums) {
            pq.add(i);
            if (pq.size() > k)
                pq.poll();
        }
        this.K = k;
    }

    public int add(int val) {
        pq.add(val);
        if (pq.size() > K)
            pq.poll();
        int res = pq.peek();
        return res;
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
