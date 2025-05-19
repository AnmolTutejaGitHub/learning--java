//package Leetcode.652. Find Duplicate Subtrees;

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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        HashMap<String,Integer> map = new HashMap<>();
        List<TreeNode> res = new ArrayList<>();
        dfs(root,map,res);
        return res;
    }
    public String dfs(TreeNode root,HashMap<String,Integer> map,List<TreeNode> res){
        if(root==null) return "";

        String l = dfs(root.left,map,res);
        String r = dfs(root.right,map,res);

        String unique_identifier = "n-"+root.val+l+"+"+r;
        map.put(unique_identifier,map.getOrDefault(unique_identifier,0)+1);

        if(map.get(unique_identifier)==2) res.add(root);
        return unique_identifier;
    }
}
