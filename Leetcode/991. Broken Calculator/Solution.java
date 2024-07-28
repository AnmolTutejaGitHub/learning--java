//package Leetcode.991. Broken Calculator;
class Solution {
    public int brokenCalc(int startValue, int target) {
        int steps = 0;

        while (target > startValue) {
            if (target % 2 != 0)
                target += 1;
            else
                target /= 2;
            steps++;
        }
        steps += (startValue - target);
        return steps;
    }
}
