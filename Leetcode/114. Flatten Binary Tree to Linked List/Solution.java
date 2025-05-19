//package Leetcode.114. Flatten Binary Tree to Linked List;

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
    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.left);   
        flatten(root.right);  

        TreeNode l = root.left;
        TreeNode r = root.right;

        root.left = null;  
        root.right = l;   

        TreeNode curr = root;
        while (curr.right != null) {  
            curr = curr.right;
        }
    
        curr.right = r;     
    }
}