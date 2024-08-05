//package Leetcode.2641. Cousins in Binary Tree II;

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
    public TreeNode replaceValueInTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        HashMap<TreeNode, Integer> brother = new HashMap<>();
        q.add(root);
        ArrayList<Integer> levelSum = new ArrayList<>();

        while (!q.isEmpty()) {
            int sum = 0;
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curr = q.poll();
                if (curr.left != null)
                    q.add(curr.left);
                if (curr.right != null)
                    q.add(curr.right);

                sum += curr.val;
            }
            levelSum.add(sum);
        }

        construct(root, levelSum, brother, 0);
        return root;
    }

    public void construct(TreeNode root, ArrayList<Integer> levelSum, HashMap<TreeNode, Integer> brother, int level) {
        if (root == null)
            return;

        int levelsum = levelSum.get(level);
        int temp = root.val;
        root.val = levelsum;
        root.val -= temp;

        if (brother.containsKey(root))
            root.val -= brother.get(root);

        if (root.left != null && root.right != null) {
            brother.put(root.left, root.right.val);
            brother.put(root.right, root.left.val);
        }

        construct(root.left, levelSum, brother, level + 1);
        construct(root.right, levelSum, brother, level + 1);
    }

}
