//package Leetcode.343.Integer Break;

class Solution {
    public int integerBreak(int n) {
        if (n == 2 || n == 3)
            return n - 1;

        int prod = 1;
        while (n > 4) {
            n -= 3;
            prod *= 3;
        }
        prod *= n;
        return prod;
    }
}
