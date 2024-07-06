//package Leetcode.2582. Pass the Pillow;

class Solution {
    public int passThePillow(int n, int time) {
        int leftBound = 1;
        int idx = 1;
        int dir = 0; // right
        for (int i = 0; i < time; i++) {
            if (dir == 0)
                idx++;
            else if (dir == 1)
                idx--;

            if (dir == 0 && idx == n) {
                dir = 1;
            } else if (dir == 1 && idx == leftBound) {
                dir = 0;
            }
        }
        return idx;
    }
}