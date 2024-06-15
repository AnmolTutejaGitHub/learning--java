//package Leetcode.701. Insert into a Binary Search Tree;

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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode ans = root;
        if (root == null)
            return new TreeNode(val);

        while (true) {
            // if(root.left==null && root.right==null){
            // if(root.val>val) root.left= new TreeNode(val);
            // else if(root.val<val) root.right= new TreeNode(val);
            // break;
            // }

            if (root.val < val) {
                if (root.right == null) {
                    root.right = new TreeNode(val);
                    break;
                }
                root = root.right;
            }

            if (root.val > val) {
                if (root.left == null) {
                    root.left = new TreeNode(val);
                    break;
                }
                root = root.left;
            }
        }
        return ans;
    }
}
