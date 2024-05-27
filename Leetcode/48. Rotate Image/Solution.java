//package Leetcode.48. Rotate Image;

class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);

        for (int i = 0; i < matrix.length; i++) {
            reverse(matrix[i]);
        }

    }

    public void transpose(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public void reverse(int[] arr) {
        int e = arr.length - 1;
        int s = 0;

        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
