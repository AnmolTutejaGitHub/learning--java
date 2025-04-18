//package Leetcode.24. Swap Nodes in Pairs;


 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            ListNode ptr_curr = curr;
            ListNode curr_next = curr.next;

            prev.next = curr_next;
            ptr_curr.next = curr_next.next;
            curr_next.next = ptr_curr;

            prev = ptr_curr;
            curr = ptr_curr.next;
        }

        return dummy.next;
    }
}