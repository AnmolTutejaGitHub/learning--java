//package Leetcode.264. Ugly Number II;

import java.util.*;

class Solution {
    public int nthUglyNumber(int n) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        TreeSet<Long> set = new TreeSet<>();
        set.add(1L);

        int idx = 0;

        while (true) {
            idx++;
            long curr = set.pollFirst();

            if (idx == n)
                return (int) curr;

            set.add(curr * 2);
            set.add(curr * 3);
            set.add(curr * 5);
        }
    }
}
