//package Leetcode.1721. Swapping Nodes in a Linked List;

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
    public ListNode swapNodes(ListNode head, int k) {

        ListNode a = head;
        ListNode b = head;

        // ListNode preva = null;
        // ListNode prevb = null;

        for (int i = 1; i < k; i++) {
            // preva = a;
            a = a.next;
        }

        int len = 0;
        ListNode node = head;
        while (node != null) {
            len++;
            node = node.next;
        }

        for (int i = 0; i < len - k; i++) {
            // prevb = b;
            b = b.next;
        }

        System.out.println(a.val);
        System.out.println(b.val);

        // ListNode nextb = b.next;
        // preva.next = b;
        // b.next = a.next;

        // prevb.next = a;
        // a.next = nextb;

        int temp = a.val;
        a.val = b.val;
        b.val = temp;

        return head;
    }
}

// intuotion :
// just swap values
