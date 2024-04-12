//package Leetcode.1823. Find the Winner of the Circular Game;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int findTheWinner(int n, int k) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= n; i++)
            queue.add(i);

        while (queue.size() != 1) {
            int count = 1;
            while (count != k) {
                queue.add(queue.remove());
                count++;
            }
            queue.remove();
        }
        return queue.peek();
    }
}
