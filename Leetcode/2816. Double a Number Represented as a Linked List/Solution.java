//package Leetcode.2816. Double a Number Represented as a Linked List;
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
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverse(head);

        int ele = (rev.val * 2) % 10;
        int carry = (rev.val * 2) / 10;
        ListNode node = new ListNode(ele);
        ListNode nodehead = node;

        ListNode traverse = rev.next;
        while (traverse != null) {
            int num = (traverse.val) * 2 + carry;
            ListNode curr = new ListNode(num % 10);
            carry = num / 10;
            node.next = curr;
            traverse = traverse.next;
            node = node.next;
        }

        if (carry > 0) {
            ListNode n = new ListNode(carry);
            node.next = n;
        }

        return reverse(nodehead);
    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
