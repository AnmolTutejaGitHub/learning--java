//package Leetcode.210. Course Schedule II;

import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] degree = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            adj.add(new ArrayList<>());

        for (int i = 0; i < prerequisites.length; i++) {
            degree[prerequisites[i][1]]++;
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }

        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0)
                q.add(i);
        }

        int[] res = new int[numCourses];
        int idx = res.length - 1;
        while (!q.isEmpty()) {
            int curr = q.poll();
            res[idx--] = curr;

            for (int neighbor : adj.get(curr)) {
                degree[neighbor]--;
                if (degree[neighbor] == 0)
                    q.add(neighbor);
            }
        }

        int[] empty = new int[0];
        // System.out.println(idx);
        if (idx >= 0)
            return empty;
        return res;
    }
}
