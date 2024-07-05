//package Leetcode.2139. Minimum Moves to Reach Target Score;

class Solution {
    public int minMoves(int target, int maxDoubles) {
        int steps = 0;
        while (maxDoubles > 0 && target > 0) {
            if (target % 2 == 0) {
                maxDoubles--;
                target = target / 2;
            } else
                target--;

            steps++;
        }
        return steps + target - 1;
    }
}
