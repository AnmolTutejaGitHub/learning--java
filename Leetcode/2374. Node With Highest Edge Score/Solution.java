//package Leetcode.2374. Node With Highest Edge Score;

class Solution {
    public int edgeScore(int[] edges) {
        long edgeScore[] = new long[edges.length];

        for (int i = 0; i < edges.length; i++) {
            edgeScore[edges[i]] += i;
        }

        long max = Integer.MIN_VALUE;
        int idx = -1;
        for (int i = 0; i < edgeScore.length; i++) {
            if (edgeScore[i] > max) {
                max = edgeScore[i];
                idx = i;
            }
        }
        return idx;
    }
}