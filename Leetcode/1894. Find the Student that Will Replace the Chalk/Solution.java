//package Leetcode.1894. Find the Student that Will Replace the Chalk;

class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if (sum > k)
                return i;
        }

        k = k % sum;
        sum = 0;
        for (int i = 0; i < chalk.length; i++) {
            sum += chalk[i];
            if (sum > k)
                return i;
        }
        return -1;
    }
}
