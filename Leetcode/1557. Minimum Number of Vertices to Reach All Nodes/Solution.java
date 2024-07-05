//package Leetcode.1557. Minimum Number of Vertices to Reach All Nodes;

import java.util.*;

class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> ls = new ArrayList<>();
        int indegree[] = new int[n];

        for (int i = 0; i < edges.size(); i++) {
            indegree[edges.get(i).get(1)]++;
        }

        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0)
                ls.add(i);
        }

        return ls;
    }
}
