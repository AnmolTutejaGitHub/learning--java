//package Leetcode.2657. Find the Prefix Common Array of Two Arrays;

class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int map[] = new int[A.length + 1];
        int C[] = new int[A.length];
        int count = 0;

        for (int i = 0; i < A.length; i++) {
            map[A[i]]++;
            map[B[i]]++;

            if (map[A[i]] == 2)
                count++;
            if (A[i] != B[i] && map[B[i]] == 2)
                count++;

            C[i] = count;
        }

        return C;
    }
}
