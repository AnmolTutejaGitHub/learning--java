//package Leetcode.633.Sum of Square Numbers;

class Solution {
    public boolean judgeSquareSum(int c) {
        int a = 0;
        int b = (int) Math.sqrt(c);
        while (a <= b) {
            long res = (long) (a * a) + (long) (b * b);
            if (res == c)
                return true;
            else if (res > c)
                b--;
            else
                a++;
        }
        return false;
    }
}
