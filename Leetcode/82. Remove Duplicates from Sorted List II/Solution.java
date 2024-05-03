// package Leetcode.82. Remove Duplicates from Sorted List II;
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode ptr1 = head;
        ListNode ptr2 = head.next;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (ptr1 != null) {
            boolean pass = false;
            while (ptr2 != null && ptr1.val == ptr2.val) {
                ptr2 = ptr2.next;
                pass = true;
            }

            if (!pass) {
                ListNode n1 = new ListNode(ptr1.val);
                temp.next = n1;
                temp = temp.next;
            }

            ptr1 = ptr2;
            if (ptr2 != null)
                ptr2 = ptr2.next;
        }

        return dummy.next;
    }
}

// intution : make 2 pointers , move 2nd poinnter till its val == ptr1
// if it is moved then ptr1 to ptr2 all node duplicate
// else ptr1 is not dumplicate
