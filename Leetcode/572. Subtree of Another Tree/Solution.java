//package Leetcode.572. Subtree of Another Tree;
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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        return subtree(root,subRoot);
    }

    public boolean subtree(TreeNode root,TreeNode subRoot){
        if(root==null) return false;
        
        if(isSameTree(root,subRoot)) return true;

        return subtree(root.left,subRoot) || subtree(root.right,subRoot);
    }

    public boolean isSameTree(TreeNode root,TreeNode subRoot){
        if(root==null && subRoot==null) return true;
        if(root==null || subRoot==null) return false;
        if(root.val!=subRoot.val) return false;

        boolean l = isSameTree(root.left,subRoot.left);
        boolean r = isSameTree(root.right,subRoot.right);
        return l&&r;
    }

}