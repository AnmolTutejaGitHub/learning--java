//package Leetcode.2095. Delete the Middle Node of a Linked List;

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
    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null)
            return null;

        ListNode mid = middle(head);
        ListNode temp = head;

        while (temp.next != null) {
            if (temp.next == mid) {
                temp.next = temp.next.next;
            }

            else
                temp = temp.next;
        }

        return head;
    }

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
