//package Leetcode.61. Rotate List;

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
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null)
            return head;

        int len = 1;
        ListNode last = head;

        while (last.next != null) {
            last = last.next;
            len++;
        }
        last.next = head;

        k = k % len;
        ListNode newLast = head;
        for (int i = 0; i < len - k - 1; i++) {
            newLast = newLast.next;
        }

        head = newLast.next;
        newLast.next = null;

        return head;

    }
}
