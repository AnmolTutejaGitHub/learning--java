//package Leetcode.2392. Build a Matrix With Conditions;

import java.util.*;

class Solution {
    public int[][] buildMatrix(int k, int[][] rowConditions, int[][] colConditions) {
        int[] topoRow = new int[k];
        int[] topoCol = new int[k];

        int indegree1[] = new int[k + 1];
        int indegree2[] = new int[k + 1];

        ArrayList<ArrayList<Integer>> adj1 = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj2 = new ArrayList<>();

        for (int i = 0; i <= k; i++) {
            adj1.add(new ArrayList<>());
            adj2.add(new ArrayList<>());
        }

        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < rowConditions.length; i++) {
            adj1.get(rowConditions[i][0]).add(rowConditions[i][1]);
            indegree1[rowConditions[i][1]]++;
        }

        for (int i = 0; i < colConditions.length; i++) {
            adj2.get(colConditions[i][0]).add(colConditions[i][1]);
            indegree2[colConditions[i][1]]++;
        }

        for (int i = 1; i < indegree1.length; i++) {
            if (indegree1[i] == 0)
                q.add(i);
        }

        int idx1 = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            topoRow[idx1++] = curr;

            for (int neighbor : adj1.get(curr)) {
                indegree1[neighbor]--;
                if (indegree1[neighbor] == 0)
                    q.add(neighbor);
            }
        }

        for (int i = 1; i < indegree2.length; i++) {
            if (indegree2[i] == 0)
                q.add(i);
        }

        int idx2 = 0;
        while (!q.isEmpty()) {
            int curr = q.poll();
            topoCol[idx2++] = curr;

            for (int neighbor : adj2.get(curr)) {
                indegree2[neighbor]--;
                if (indegree2[neighbor] == 0)
                    q.add(neighbor);
            }
        }

        // System.out.println(Arrays.toString(topoRow));
        // System.out.println(Arrays.toString(topoCol));

        int[][] matrix = new int[k][k];
        if (idx1 != k || idx2 != k)
            return new int[0][0];

        for (int i = 1; i <= k; i++) {
            matrix[indexOf(topoRow, i)][indexOf(topoCol, i)] = i;
        }

        return matrix;
    }

    public static int indexOf(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }
}
