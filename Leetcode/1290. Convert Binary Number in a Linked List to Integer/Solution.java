//package Leetcode.1290. Convert Binary Number in a Linked List to Integer;

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
    public int getDecimalValue(ListNode head) {
        int num = 0;
        ListNode curr = head;

        while (curr != null) {
            num = num * 2 + curr.val;
            curr = curr.next;
        }

        return num;

    }
}
