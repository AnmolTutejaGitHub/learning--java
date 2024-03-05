//package Leetcode.160. Intersection of Two Linked Lists;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode node1 = headA;
        ListNode node2 = headB;

        while (node1 != null && node2 != null) {
            if (set.contains(node1))
                return node1;
            else
                set.add(node1);

            if (set.contains(node2))
                return node2;
            else
                set.add(node2);

            node1 = node1.next;
            node2 = node2.next;
        }

        while (node1 != null) {
            if (set.contains(node1))
                return node1;
            set.add(node1);
            node1 = node1.next;
        }

        while (node2 != null) {
            if (set.contains(node2))
                return node2;
            set.add(node2);
            node2 = node2.next;
        }

        return null;
    }
}
