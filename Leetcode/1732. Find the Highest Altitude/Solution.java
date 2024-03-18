//package Leetcode.1732. Find the Highest Altitude;

class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int[] altitude = new int[gain.length + 1];
        altitude[0] = 0;
        for (int i = 1; i < altitude.length; i++) {
            altitude[i] = altitude[i - 1] + gain[i - 1];
            max = Integer.max(altitude[i], max);
        }
        return max;
    }
}
