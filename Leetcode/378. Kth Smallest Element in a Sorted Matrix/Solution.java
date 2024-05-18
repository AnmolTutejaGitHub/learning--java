// package Leetcode.378. Kth Smallest Element in a Sorted Matrix;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(com);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                pq.add(matrix[i][j]);
            }
        }

        while (k > 1) {
            pq.poll();
            k--;
        }

        return pq.peek();
    }

    Comparator<Integer> com = new Comparator<Integer>() {
        public int compare(Integer a, Integer b) {
            return a.compareTo(b);
        }
    };
}