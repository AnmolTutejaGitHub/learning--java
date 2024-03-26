//package Leetcode.2487. Remove Nodes From Linked List;

import java.util.ArrayDeque;
import java.util.Deque;

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
    public ListNode removeNodes(ListNode head) {
        Deque<Integer> st = new ArrayDeque<>();
        ListNode temp = head;

        while (temp != null) {
            while (!st.isEmpty() && st.peekLast() < temp.val) {
                st.removeLast();
            }
            st.addLast(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(-1);
        ListNode t2 = dummy;
        while (!st.isEmpty()) {
            ListNode t3 = new ListNode(st.removeFirst());
            t2.next = t3;
            t2 = t2.next;
        }
        return dummy.next;
    }
}
