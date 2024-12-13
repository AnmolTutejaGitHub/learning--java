//package Leetcode.2593. Find Score of an Array After Marking All Elements;

import java.util.PriorityQueue;

class Pair {
    int n;
    int i;

    public Pair(int n, int i) {
        this.n = n;
        this.i = i;
    }
}

class Solution {
    public long findScore(int[] nums) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.n != b.n ? a.n - b.n : a.i - b.i);
        long score = 0;
        for (int i = 0; i < nums.length; i++) {
            pq.add(new Pair(nums[i], i));
        }
        int marked[] = new int[nums.length];

        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            if (marked[p.i] != 1) {
                score += p.n;
                if (p.i - 1 >= 0)
                    marked[p.i - 1] = 1;
                if (p.i + 1 < nums.length)
                    marked[p.i + 1] = 1;
            }
        }
        return score;
    }
}