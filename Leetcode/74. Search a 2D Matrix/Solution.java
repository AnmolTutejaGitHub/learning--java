//package Leetcode.74. Search a 2D Matrix;

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int s = 0;
        int e = row*col -1;

        while(s<=e){
            int m = s+(e-s) / 2;
            int ele = matrix[m/col][m%col];

            if(ele==target) return true;
            if(ele<target) s=m+1;
            else e=m-1;
        }
        return false;
    }
}