//package Leetcode.142. Linked List Cycle II;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Solution {
    public ListNode detectCycle(ListNode head) {

        // HashMap<ListNode,Integer> map = new HashMap<>();

        // ListNode node = head;
        // int index = 0 ;

        // while(node!=null){
        // if(map.containsKey(node)) return node;

        // else map.put(node,index++);
        // node = node.next;
        // }
        // return null;

        ListNode slow = head;
        ListNode fast = head;

        Boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                cycle = true;
                break;
            }
        }

        if (!cycle)
            return null;

        slow = head;

        while (fast != slow) {
            slow = slow.next;
            fast = fast.next;
        }

        return fast;

    }
}
