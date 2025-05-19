//package Leetcode.1530. Number of Good Leaf Nodes Pairs;

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
    public int countPairs(TreeNode root, int distance) {
        HashSet<TreeNode> leafs = new  HashSet<>();
        getLeafNodes(root,leafs);
        HashMap<TreeNode,TreeNode> parents = new HashMap<>();
        markParents(root,parents);
        int count[] = new int[1];
        for(TreeNode leaf : leafs){
            HashSet<TreeNode> vis = new HashSet<>();
            dfs(leaf,0,distance,count,parents,leafs,vis);
        } 
        return count[0]/2;
    }

    public void getLeafNodes(TreeNode root, HashSet<TreeNode>leafs){
        if(root==null) return;

        if(root.left==null && root.right==null) leafs.add(root);
        getLeafNodes(root.left,leafs);
        getLeafNodes(root.right,leafs);
    }

    public void markParents(TreeNode root,HashMap<TreeNode,TreeNode> parents){
        if(root==null) return;
        if(root.left!=null) parents.put(root.left,root);
        if(root.right!=null) parents.put(root.right,root);
        markParents(root.left,parents);
        markParents(root.right,parents);
    }

    public void dfs(TreeNode curr,int dis,int distance,int[]count,
    HashMap<TreeNode,TreeNode> parents,HashSet<TreeNode> leafs,HashSet<TreeNode> vis){

        if(dis>distance) return;
        if(curr==null) return;
        if(vis.contains(curr)) return;
        vis.add(curr);
        if(leafs.contains(curr) && dis>0) count[0]++;

        dfs(curr.left,dis+1,distance,count,parents,leafs,vis);
        dfs(curr.right,dis+1,distance,count,parents,leafs,vis);
        dfs(parents.get(curr),dis+1,distance,count,parents,leafs,vis);
    }
}
