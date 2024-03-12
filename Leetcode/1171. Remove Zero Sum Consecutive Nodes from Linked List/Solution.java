//package Leetcode.1171. Remove Zero Sum Consecutive Nodes from Linked List;

import java.util.ArrayList;
import java.util.Arrays;

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
    public ListNode removeZeroSumSublists(ListNode head) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }

        int[] prefix = new int[arr.size()];
        prefix[0] = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            prefix[i] = prefix[i - 1] + arr.get(i);
        }

        // HashMap<Integer,ListNode> map = new HashMap<>();

        // temp = head;
        // int idx = 0;

        // while(temp!=null){
        // if(map.containsKey(prefix[idx])){
        // map.get(prefix[idx]).next = temp.next;
        // }

        // else map.put(prefix[idx],temp);

        // if(idx<prefix.length && prefix[idx]==0) {
        // head = map.get(prefix[idx]).next;
        // }

        // idx++;
        // temp = temp.next;

        // }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (prefix[i] != Integer.MAX_VALUE && prefix[i] == prefix[j]) {
                    for (int k = i + 1; k <= j; k++) {
                        prefix[k] = Integer.MAX_VALUE;
                        arr.set(k, Integer.MAX_VALUE);
                    }
                }

                if (prefix[j] == 0) {
                    for (int k = 0; k <= j; k++) {
                        prefix[k] = Integer.MAX_VALUE;
                        arr.set(k, Integer.MAX_VALUE);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(prefix));
        System.out.println(arr);

        ListNode dummy = new ListNode(-1);
        ListNode t2 = dummy;

        for (int ele : arr) {
            if (ele != Integer.MAX_VALUE && ele != 0) {
                ListNode node = new ListNode(ele);
                t2.next = node;
                t2 = t2.next;
            }

        }

        return dummy.next;
    }
}
