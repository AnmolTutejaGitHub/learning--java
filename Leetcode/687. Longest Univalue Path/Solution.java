//package Leetcode.687. Longest Univalue Path;

import java.util.*;

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
    public int longestUnivaluePath(TreeNode root) {
        HashSet<TreeNode> nodes = new HashSet<>();
        int[]longest = new int[1];
        markNodes(root,nodes);
        for(TreeNode node : nodes){
            dfs(node,longest,node);
        }
        
        if(longest[0]==0) return 0;
        return longest[0]-1;
    }
    public void markNodes(TreeNode root,HashSet<TreeNode> nodes){
        if(root==null) return;

        markNodes(root.left,nodes);
        markNodes(root.right,nodes);
        nodes.add(root);
    }

    public int dfs(TreeNode curr,int[]longest,TreeNode node){
        if(curr==null) return 0;

        if(curr.val!=node.val) return 0;

        int l = dfs(curr.left,longest,node);
        int r = dfs(curr.right,longest,node);

        int path = l+r+1; 
        longest[0] = Math.max(longest[0],path);
        return Math.max(l,r)+1;
    }
}