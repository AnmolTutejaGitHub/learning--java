//package Leetcode.2022. Convert 1D Array Into 2D Array;
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != m * n)
            return new int[0][0];
        int res[][] = new int[m][n];

        int idx_m = 0;
        int idx_n = 0;
        for (int i = 0; i < original.length; i++) {
            res[idx_m][idx_n++] = original[i];
            if (idx_n >= n) {
                idx_n = 0;
                idx_m++;
            }
        }
        return res;
    }
}
