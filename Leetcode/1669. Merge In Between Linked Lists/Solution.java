//package Leetcode.1669. Merge In Between Linked Lists;

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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode preva = list1;
        ListNode nextb = list1;

        for (int i = 0; i < a - 1; i++) {
            preva = preva.next;
        }

        for (int i = 0; i <= b; i++) {
            nextb = nextb.next;
        }

        preva.next = list2;

        ListNode end = list2;
        while (end.next != null) {
            end = end.next;
        }
        end.next = nextb;

        return list1;
    }
}
