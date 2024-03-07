//package Leetcode.203. Remove Linked List Elements;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        ListNode node = head;

        if (head == null)
            return head;

        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else
                node = node.next;
        }

        if (head.val == val)
            head = head.next;
        return head;

        // ListNode prev = null;
        // while(node!=null){

        // if(node.val==val){
        // prev.next = node.next;
        // node = node.next.next
        // }

        // node=node.next;
        // prev = prev.next;
        // }

    }
}

// intution of prev failed so thought assumed head.val!=val check others and in
// the end check it
