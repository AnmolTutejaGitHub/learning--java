//package Leetcode.101. Symmetric Tree;

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

class Solution {
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> ls = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                if (q.peek() == null) {
                    q.remove();
                    ls.add(null);
                    continue;
                }

                if (q.peek().left != null)
                    q.add(q.peek().left);
                else
                    q.add(null);

                if (q.peek().right != null)
                    q.add(q.peek().right);
                else
                    q.add(null);

                ls.add(q.remove().val);
            }
            if (!isPalindrome(ls))
                return false;
        }
        return true;
    }

    public boolean isPalindrome(List<Integer> ls) {
        int s = 0;
        int e = ls.size() - 1;
        while (s < e) {
            if (ls.get(s) != ls.get(e))
                return false;
            s++;
            e--;
        }
        return true;
    }
}

// intution : Integer.Min for null
// with null use bfs to check each level palindrome
