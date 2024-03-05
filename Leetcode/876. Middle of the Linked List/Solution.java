//package Leetcode.876. Middle of the Linked List;

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
    public ListNode middleNode(ListNode head) {

        int len = 0;

        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }

        int middle = len / 2;

        node = head;
        int index = 0;
        while (node != null) {
            if (index == middle)
                return node;
            node = node.next;
            index++;
        }

        return null;
    }
}
