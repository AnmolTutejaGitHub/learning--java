//package Leetcode.2058. Find the Minimum and Maximum Number of Nodes Between Critical Points;

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

class Pair {
    int node;
    int index;

    Pair(int node, int index) {
        this.node = node;
        this.index = index;
    }
}

class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        // ArrayList<Pair> minimas = new ArrayList<>();
        // ArrayList<Pair> maximas = new ArrayList<>();
        ArrayList<Pair> criticals = new ArrayList<>();
        int[] ans = { -1, -1 };
        if (head == null)
            return ans;

        ListNode node = head;
        ListNode prev = null;
        ListNode next = head.next;
        int i = 0;
        while (node != null && node.next != null) {
            if (prev != null) {
                if (node.val > prev.val && node.val > next.val)
                    criticals.add(new Pair(node.val, i));
                if (node.val < prev.val && node.val < next.val)
                    criticals.add(new Pair(node.val, i));
            }

            prev = node;
            node = node.next;
            next = next.next;
            i++;
        }

        // if(minimas.size()<=1 || maximas.size()<=1) return ans;
        if (criticals.size() <= 1)
            return ans;

        // ans[1] = maximas.get(maximas.size()-1).index - minimas.get(0).index;
        ans[1] = criticals.get(criticals.size() - 1).index - criticals.get(0).index;

        ans[0] = Integer.MAX_VALUE;
        for (int j = 1; j < criticals.size(); j++)
            ans[0] = Math.min(ans[0], criticals.get(j).index - criticals.get(j - 1).index);
        return ans;
    }
}
