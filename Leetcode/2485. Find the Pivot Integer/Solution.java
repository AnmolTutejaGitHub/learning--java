//package Leetcode.2485. Find the Pivot Integer;

class Solution {
    public int pivotInteger(int n) {
        int x;
        int ls = 0;
        int ts = 0;
        for (int i = 1; i <= n; i++) {
            ts += i;
        }
        for (int i = 1; i <= n; i++) {
            x = i;
            ls = 0;
            for (int j = 1; j <= x; j++) {
                ls += j;
            }
            if ((ts - ls + x == ls))
                return x;
        }

        return -1;
    }
}
