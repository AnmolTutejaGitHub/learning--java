//package Leetcode.1052. Grumpy Bookstore Owner;

class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int s = 0;
        int initial = 0;
        int currSum = 0;
        int maxSum = 0;

        for (int i = 0; i < grumpy.length; i++) {
            if (grumpy[i] == 0)
                initial += customers[i];
        }

        for (int e = 0; e < grumpy.length; e++) {
            if (grumpy[e] == 1)
                currSum += customers[e];

            if (e - s + 1 > minutes) {
                if (grumpy[s] == 1)
                    currSum -= customers[s];
                s++;
            }
            maxSum = Math.max(currSum, maxSum);
        }

        return initial + maxSum;
    }
}
