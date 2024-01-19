//package Leetcode.29. Divide Two Integers;

class Solution {
    public int divide(int dividend, int divisor) {
        long ans = (long) dividend / divisor;
        if (ans > ((long) Math.pow(2, 31)) - 1)
            ans = (long) Math.pow(2, 31) - 1;
        if (ans < ((long) Math.pow(-2, 31)))
            ans = (long) Math.pow(-2, 31);

        // i dnt know if using combination of long and Integer.MAX_VALUE properly
        // handles overflow
        return (ans > (long) Integer.MAX_VALUE) ? Integer.MAX_VALUE : (int) ans;
    }
}
