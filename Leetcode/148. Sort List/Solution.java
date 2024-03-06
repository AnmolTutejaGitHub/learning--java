//package Leetcode.148. Sort List;

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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode mid = middle(head);
        ListNode midNext = mid.next;
        mid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(midNext);

        return merge(left, right);
    }

    public ListNode merge(ListNode list1, ListNode list2) {

        ListNode ans = new ListNode();
        ListNode node = ans;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                node = node.next;
                list1 = list1.next;
            } else {
                node.next = list2;
                node = node.next;
                list2 = list2.next;
            }
        }

        while (list1 != null) {
            node.next = list1;
            node = node.next;
            list1 = list1.next;
        }

        while (list2 != null) {
            node.next = list2;
            node = node.next;
            list2 = list2.next;
        }

        return ans.next;
    }

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = head;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }
}
