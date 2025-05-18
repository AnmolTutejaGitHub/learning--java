//package Leetcode.450. Delete Node in a BST;

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
    public TreeNode deleteNode(TreeNode root, int key) {
        return del(root,key);
    }

    public TreeNode del(TreeNode root,int key){
        if(root==null) return null;

        if(key<root.val) root.left = del(root.left,key);
        else if(key>root.val) root.right = del(root.right,key);
        else {
            if(root.left==null) return root.right;
            else if(root.right==null) return root.left;

            else{
                TreeNode node = root.right;
                while(node.left!=null) node = node.left;
                
                root.val = node.val;
                root.right = del(root.right,node.val);
            }
        }

        return root;
    }
}