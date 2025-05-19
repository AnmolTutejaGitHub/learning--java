//package Leetcode.501. Find Mode in Binary Search Tree;

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
    private TreeNode ROOT;
    private int maxfreq;
    private Integer prevVal = null;
    private int currfreq;
    private HashSet<Integer> res = new HashSet<>();
    public int[] findMode(TreeNode root) {
        ROOT = root;
        inorder(root);
        int[] ans = new int[res.size()];
        int idx = 0;
        for(int i : res) ans[idx++] = i;
        return ans;
    }

    public void inorder(TreeNode root){
        if(root==null) return;
        
        inorder(root.left);

        if(prevVal!=null && root.val==prevVal) currfreq+=1;
        else currfreq=1;
        if(currfreq==maxfreq) res.add(root.val);
        else if(currfreq>maxfreq) {
            maxfreq = currfreq;
            res.clear();
            res.add(root.val);
        }

        prevVal = root.val;
        inorder(root.right);
    }
}