//package Leetcode.2181. Merge Nodes in Between Zeros;

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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode n = dummy;
        ListNode end = head;

        while (end != null) {
            int sum = 0;
            do {
                sum += end.val;
                end = end.next;
            } while (end != null && end.val != 0);

            if (sum == 0)
                continue;
            ListNode node = new ListNode(sum);
            n.next = node;
            n = n.next;
        }
        return dummy.next;
    }
}
