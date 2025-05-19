//package Leetcode.99. Recover Binary Search Tree;
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }

class Solution {
    private TreeNode a;
    private TreeNode b;
    private TreeNode prev;

    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = a.val;
        a.val = b.val;
        b.val = temp;

    }
    public void inorder(TreeNode node){
        if(node==null) return;

        inorder(node.left);

        if(prev!=null && prev.val>node.val){
            if(a==null) a = prev;
            b = node;
        }

        prev = node;
        inorder(node.right);
    }
}