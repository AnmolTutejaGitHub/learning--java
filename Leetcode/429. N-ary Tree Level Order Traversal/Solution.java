//package Leetcode.429. N-ary Tree Level Order Traversal;

import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null)
            return res;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                for (Node node : curr.children) {
                    q.add(node);
                }
                ls.add(curr.val);
            }
            if (ls.size() != 0)
                res.add(ls);
        }
        return res;
    }
}
