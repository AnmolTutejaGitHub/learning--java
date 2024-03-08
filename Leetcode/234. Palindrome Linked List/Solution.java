//package Leetcode.234. Palindrome Linked List;

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
    public boolean isPalindrome(ListNode head) {

        ListNode mid = middle(head);

        ListNode curr = mid;
        ListNode prev = null;

        while (curr != null) {
            ListNode nextcurr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextcurr;
        }

        ListNode right = prev;
        ListNode left = head;

        while (right != null) {
            if (left.val != right.val)
                return false;

            left = left.next;
            right = right.next;
        }

        return true;

    }

    public ListNode middle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
