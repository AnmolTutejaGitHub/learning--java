//package Leetcode.3217. Delete Nodes From Linked List Present in Array;

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
    public ListNode modifiedList(int[] nums, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums)
            set.add(i);

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (set.contains(temp.next.val))
                temp.next = temp.next.next;
            else
                temp = temp.next;
        }
        if (set.contains(head.val))
            head = head.next;
        return head;
    }
}
