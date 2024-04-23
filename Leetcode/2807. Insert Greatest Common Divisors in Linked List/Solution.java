//package Leetcode.2807. Insert Greatest Common Divisors in Linked List;

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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode traverse = dummy;

        ListNode node = head;

        while (node != null && node.next != null) {
            ListNode a = node;
            ListNode b = node.next;

            ListNode hcf = new ListNode(gcd(a.val, b.val));

            traverse.next = new ListNode(a.val);
            traverse = traverse.next;

            traverse.next = hcf;
            traverse = traverse.next;

            node = node.next;
        }

        if (node != null) {
            traverse.next = new ListNode(node.val);
            traverse = traverse.next;
        }
        return dummy.next;
    }

    public int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
