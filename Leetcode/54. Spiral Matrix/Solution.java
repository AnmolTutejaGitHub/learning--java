//package Leetcode.54. Spiral Matrix;

import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();

        int dir = 0;
        int top = 0;
        int bottom = matrix.length - 1;
        int right = matrix[0].length - 1;
        int left = 0;

        while (left <= right && top <= bottom) {
            if (dir == 0) {
                for (int i = left; i <= right; i++)
                    res.add(matrix[top][i]);
                top += 1;
                dir += 1;
            } else if (dir == 1) {
                for (int i = top; i <= bottom; i++)
                    res.add(matrix[i][right]);
                right -= 1;
                dir += 1;
            } else if (dir == 2) {
                for (int i = right; i >= left; i--)
                    res.add(matrix[bottom][i]);
                bottom -= 1;
                dir += 1;
            } else if (dir == 3) {
                for (int i = bottom; i >= top; i--)
                    res.add(matrix[i][left]);
                left += 1;
                dir += 1;
            }

            dir = dir % 4;
        }
        return res;
    }
}
