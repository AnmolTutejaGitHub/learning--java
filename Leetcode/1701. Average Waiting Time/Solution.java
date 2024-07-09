//package Leetcode.1701. Average Waiting Time;

class Solution {
    public double averageWaitingTime(int[][] customers) {
        int prev = 0;
        int[] wt = new int[customers.length];
        int ct = 0;

        for (int i = 0; i < customers.length; i++) {
            ct = Math.max(customers[i][0], prev) + customers[i][1];
            wt[i] = ct - customers[i][0];
            prev = ct;
        }

        double avg = 0;
        for (int i = 0; i < wt.length; i++) {
            avg += wt[i];
        }
        return (double) avg / wt.length;
    }
}