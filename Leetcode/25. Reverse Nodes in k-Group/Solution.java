//package Leetcode.25. Reverse Nodes in k-Group;
// https://leetcode.com/problems/reverse-nodes-in-k-group/description/
 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode _dummy = dummy;
        ListNode curr = head;

        while (curr != null) {
            ListNode kthNode = getkthNode(curr, k);
            if (kthNode == null){
                _dummy.next = curr;
                break;
            }

            ListNode kthNodeNext = kthNode.next;
            kthNode.next = null;

            ListNode rev = reverse(curr);
            _dummy.next = rev;

            _dummy = curr;
            curr = kthNodeNext;
        }

        return dummy.next;
    }

    public ListNode getkthNode(ListNode ref, int k) {
        int count = 1;
        while (ref != null && count < k) {
            count++;
            ref = ref.next;
        }
        return ref;
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

