//package Leetcode.92. Reverse Linked List II;
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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if (head == null || head.next == null || left == right)
            return head;

        ListNode temp = head;
        ListNode leftNode = head;
        ListNode rightNode = head;
        ListNode prevL = null;
        ListNode nextR = null;

        for (int i = 1; i < left; i++) {
            prevL = leftNode;
            leftNode = leftNode.next;
        }

        for (int i = 1; i < right; i++) {
            rightNode = rightNode.next;
        }
        nextR = rightNode.next;

        System.out.println(leftNode.val);
        System.out.println(rightNode.val);

        rightNode.next = null;

        if (prevL == null)
            head = reverse(leftNode);
        else
            prevL.next = reverse(leftNode);
        leftNode.next = nextR;

        return head;

    }

    public ListNode reverse(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
