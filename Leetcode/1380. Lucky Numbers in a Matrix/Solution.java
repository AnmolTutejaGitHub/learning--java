//package Leetcode.1380. Lucky Numbers in a Matrix;

import java.util.*;

class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        HashSet<Integer> rows = new HashSet<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < matrix[0].length; j++) {
                min = Math.min(min, matrix[i][j]);
            }
            rows.add(min);
        }

        for (int i = 0; i < matrix[0].length; i++) {
            int max = 0;
            for (int j = 0; j < matrix.length; j++) {
                max = Math.max(max, matrix[j][i]);
            }
            if (rows.contains(max))
                res.add(max);
        }
        return res;
    }
}
