//package Leetcode.2558. Take Gifts From the Richest Pile;

class Solution {
    public long pickGifts(int[] gifts, int k) {
        for (int i = 0; i < k; i++) {
            int maxi = max(gifts);
            for (int j = 0; j < gifts.length; j++) {
                if (gifts[j] == maxi) {
                    gifts[j] = (int) Math.sqrt(gifts[j]);
                    break;
                }
            }
        }

        // sum
        long sum = 0;
        for (int i = 0; i < gifts.length; i++)
            sum += gifts[i];

        return sum;
    }

    private static int max(int[] gifts) {
        int maximum = gifts[0];
        for (int i = 0; i < gifts.length; i++) {
            if (gifts[i] > maximum)
                maximum = gifts[i];
        }
        return maximum;
    }
}

// algo I am thiinking
// find max
// take its sqrt
// repeat this k times
