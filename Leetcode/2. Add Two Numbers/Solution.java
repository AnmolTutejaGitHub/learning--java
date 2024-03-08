//package Leetcode.2. Add Two Numbers;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;

        ListNode dummy = new ListNode(-1);

        int carry = 0;

        ListNode curr = dummy;

        int sum = 0;
        while (temp1 != null || temp2 != null) {
            sum = carry;
            if (temp1 != null)
                sum += temp1.val;
            if (temp2 != null)
                sum += temp2.val;

            // curr.next.val = sum%10;
            ListNode newNode = new ListNode(sum % 10);
            carry = sum / 10;

            curr.next = newNode;
            curr = curr.next;

            if (temp1 != null)
                temp1 = temp1.next;
            if (temp2 != null)
                temp2 = temp2.next;
        }

        if (carry > 0) {
            // curr.next.val = carry; // giving can''t assign val to null
            ListNode newNode = new ListNode(carry);
            curr.next = newNode;
        }

        return dummy.next;
    }
}
