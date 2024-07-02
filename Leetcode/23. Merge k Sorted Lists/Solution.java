// package Leetcode.23. Merge k Sorted Lists;

import java.util.*;

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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];
            while (head != null) {
                pq.add(head.val);
                head = head.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        while (!pq.isEmpty()) {
            node.next = new ListNode(pq.poll());
            node = node.next;
        }
        return dummy.next;
    }
}