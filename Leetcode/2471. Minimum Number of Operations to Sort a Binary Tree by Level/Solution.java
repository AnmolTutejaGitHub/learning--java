//package Leetcode.2471. Minimum Number of Operations to Sort a Binary Tree by Level;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    int val;
    int idx;

    Pair(int val, int idx) {
        this.val = val;
        this.idx = idx;
    }
}

class Solution {
    public int minimumOperations(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int min = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();

                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);
                arr.add(curr.val);
            }
            min += minSwaps(arr);
        }
        return min;
    }

    public int minSwaps(List<Integer> ls) {
        Pair map[] = new Pair[ls.size()];

        for (int i = 0; i < ls.size(); i++) {
            map[i] = new Pair(ls.get(i), i);
        }

        Arrays.sort(map, (a, b) -> Integer.compare(a.val, b.val));
        boolean vis[] = new boolean[ls.size()];
        int swaps = 0;

        for (int i = 0; i < ls.size(); i++) {
            if (vis[i] || map[i].idx == i) {
                continue;
            }

            int cycleSize = 0;
            int x = i;

            while (!vis[x]) {
                vis[x] = true;
                x = map[x].idx;
                cycleSize++;
            }

            if (cycleSize > 0) {
                swaps += (cycleSize - 1);
            }
        }
        return swaps;
    }
}