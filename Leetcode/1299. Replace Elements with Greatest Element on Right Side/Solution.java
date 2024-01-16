//package Leetcode.1299. Replace Elements with Greatest Element on Right Side;

class Solution {
    public int[] replaceElements(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max)
                    max = arr[j];

            }
            arr[i] = max;
            // arr[arr.length-1]=-1;

        }
        arr[arr.length - 1] = -1;
        return arr;

    }
}