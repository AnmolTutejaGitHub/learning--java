//package Leetcode.2033. Minimum Operations to Make a Uni-Value Grid;

import java.util.Arrays;

class Solution {
    public int minOperations(int[][] grid, int x) {
        int n = grid.length;
        int m = grid[0].length;
        int normalize [] = new int[n*m];
        int idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                normalize[idx++] = grid[i][j];
            }
        }

        Arrays.sort(normalize);
        int midx = normalize.length/2;
        int median = normalize[midx];
        int opr = 0;

        for(int i=0;i<normalize.length;i++){
            int diff = Math.abs(normalize[i] - median);
            int times = diff/x;
            if(diff % x!=0) return -1;
            opr+=times;
        }
        return opr;

    }
}