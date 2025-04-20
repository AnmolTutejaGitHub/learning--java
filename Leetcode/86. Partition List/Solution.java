//package Leetcode.86. Partition List;
class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode lessThan = new ListNode(-1);
        ListNode ptr_lessThan = lessThan;
        ListNode greaterThanEq = new ListNode(-1);
        ListNode ptr_greaterThanEq = greaterThanEq;

        ListNode curr = head;
        while(curr!=null){
            ListNode node = new ListNode(curr.val);
            if(curr.val<x) {
                lessThan.next = node;
                lessThan = lessThan.next;
            }else{
                greaterThanEq.next = node;
                greaterThanEq = greaterThanEq.next;
            }
            curr = curr.next;
        }
        lessThan.next = ptr_greaterThanEq.next;
        return ptr_lessThan.next;
    }
}