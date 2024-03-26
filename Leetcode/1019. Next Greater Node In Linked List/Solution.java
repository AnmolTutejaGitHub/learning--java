//package Leetcode.1019. Next Greater Node In Linked List;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] res = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            while (!st.isEmpty() && list.get(st.peek()) < list.get(i)) {
                res[st.pop()] = list.get(i);
            }

            st.push(i);
        }

        return res;
    }
}
