//package Leetcode.21. Merge Two Sorted Lists;

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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

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

}
