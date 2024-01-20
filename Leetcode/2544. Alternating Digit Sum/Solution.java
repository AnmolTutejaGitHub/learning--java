//package Leetcode.2544. Alternating Digit Sum;

class Solution {
    public int alternateDigitSum(int n) {
        int len = ("" + n).length();
        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i % 2 != 0) {
                sum -= Integer.parseInt("" + ("" + n).charAt(i));
            } else
                sum += Integer.parseInt("" + ("" + n).charAt(i));
        }
        return sum;

    }
}
