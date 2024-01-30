//package Leetcode.1780. Check if Number is a Sum of Powers of Three;

class Solution {
    public boolean checkPowersOfThree(int n) {
        // similor to isPowerOf3

        while (n > 1) {
            if (n % 3 != 0 && (n - 1) % 3 != 0) { // n-1 for 3 power 0
                // System.out.println(n);
                return false;
            }

            n = n / 3;
        }
        return n == 1;
    }
}
