//package Leetcode.304. Range Sum Query 2D - Immutable;

class NumMatrix {
    static int prefix[][];

    public NumMatrix(int[][] matrix) {
        int prefix_[][] = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++)
            prefix_[i][0] = matrix[i][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                prefix_[i][j] += prefix_[i][j - 1] + matrix[i][j];
            }
        }
        prefix = prefix_;
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int pcol1 = 0;
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            pcol1 = col1 - 1 >= 0 ? prefix[i][col1 - 1] : 0;
            sum += prefix[i][col2] - pcol1;
        }
        return sum;
    }
}