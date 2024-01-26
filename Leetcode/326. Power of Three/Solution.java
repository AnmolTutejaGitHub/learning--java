//package Leetcode.326. Power of Three;

class Solution {
    public boolean isPowerOfThree(int n) {
        // precision error in below logic
        // if(n<=0) return false;
        // int x = (int)( Math.log(n) / Math.log(3));
        // return n == Math.pow(3,x);

        while (n > 1) {
            if (n % 3 != 0)
                return false;
            n = n / 3;
        }

        return n == 1;
    }
}