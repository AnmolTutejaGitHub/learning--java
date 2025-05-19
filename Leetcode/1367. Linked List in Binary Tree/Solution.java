//package Leetcode.1367. Linked List in Binary Tree;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
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
    public boolean isSubPath(ListNode head, TreeNode root) {
        return dfs(head,root);
    }
    public boolean dfs(ListNode head,TreeNode root){
        if(root==null) return false;

        if(isConnected(head,root)) return true;

        boolean l = dfs(head,root.left);
        boolean r = dfs(head,root.right);
        return l || r;
    }

    public boolean isConnected(ListNode head,TreeNode root){
        if(head==null) return true;
        if(root==null) return false;
        if(root.val!=head.val) return false;
        boolean l = isConnected(head.next,root.left);
        boolean r = isConnected(head.next,root.right);
        return l || r;
    }
}