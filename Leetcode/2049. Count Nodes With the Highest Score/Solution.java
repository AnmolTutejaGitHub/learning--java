//package Leetcode.2049. Count Nodes With the Highest Score;

import java.util.*;

class Solution {
    public int countHighestScoreNodes(int[] parents) {
        int size = parents.length;

        HashMap<Integer, ArrayList<Integer>> children = new HashMap<>();

        for (int i = 0; i < parents.length; i++) {
            ArrayList<Integer> ls = new ArrayList<>();
            children.put(i, ls);
        }

        for (int i = 1; i < parents.length; i++) {
            children.get(parents[i]).add(i);
        }

        long[] max = new long[1];
        int[] maxcount = new int[1];

        dfs(0, children, size, max, maxcount);
        return maxcount[0];
    }

    public int dfs(int curr, HashMap<Integer, ArrayList<Integer>> children, int size, long[] max, int[] maxcount) {

        int subnodes = 1;
        long score = 1L;
        for (int child : children.get(curr)) {
            int childSubtreeSize = dfs(child, children, size, max, maxcount);
            subnodes += childSubtreeSize;
            score *= childSubtreeSize;
        }

        if (curr != 0)
            score *= (size - subnodes);

        if (score == max[0])
            maxcount[0]++;
        else if (score > max[0]) {
            max[0] = score;
            maxcount[0] = 1;
        }

        return subnodes;
    }
}
