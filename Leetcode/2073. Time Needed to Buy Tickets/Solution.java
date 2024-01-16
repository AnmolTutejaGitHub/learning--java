//package Leetcode.2073. Time Needed to Buy Tickets;

class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int pass = 0;
        while (tickets[k] > 0) {
            for (int j = 0; j < tickets.length; j++) {
                if (tickets[j] > 0) {
                    tickets[j]--;
                    pass++;
                }

                if (j == k && tickets[j] == 0)
                    break;

            }
        }
        return pass;
    }
}
