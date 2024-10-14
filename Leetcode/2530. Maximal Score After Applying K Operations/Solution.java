//package Leetcode.2530. Maximal Score After Applying K Operations;

import java.util.PriorityQueue;

class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 - p1);

        for (int i : nums) {
            pq.add(i);
        }

        long score = 0;
        while (!pq.isEmpty() && k > 0) {
            int curr = pq.poll();
            score += curr;
            pq.add((int) Math.ceil(curr / 3.0));
            k--;
        }
        return score;
    }
}
