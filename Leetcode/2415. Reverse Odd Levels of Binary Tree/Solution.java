// package Leetcode.2415. Reverse Odd Levels of Binary Tree;

import java.util.LinkedList;
import java.util.Queue;

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

class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        BFS(root);
        return root;
    }

    public void BFS(TreeNode node) {
        int level = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(node);

        while (!q.isEmpty()) {
            int size = q.size();
            TreeNode[] arr = new TreeNode[size];
            for (int i = 0; i < size; i++) {
                if (q.peek().left != null)
                    q.add(q.peek().left);
                if (q.peek().right != null)
                    q.add(q.peek().right);

                arr[i] = q.remove();
            }
            if (level % 2 == 0)
                reverse(arr);
            level++;
        }
    }

    void reverse(TreeNode[] arr) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int temp = arr[i].val;
            arr[i].val = arr[j].val;
            arr[j].val = temp;
            i++;
            j--;
        }
    }
}
