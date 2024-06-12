//package Leetcode.987. Vertical Order Traversal of a Binary Tree;

import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Pair {
    TreeNode node;
    int row;
    int col;

    public Pair(TreeNode node, int row, int col) {
        this.node = node;
        this.row = row;
        this.col = col;
    }

}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        PriorityQueue<Pair> pq = new PriorityQueue<>(com);
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0, 0));
        pq.add(new Pair(root, 0, 0));
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                Pair curr = q.peek();

                if (curr.node.left != null) {
                    q.add(new Pair(curr.node.left, curr.row + 1, curr.col - 1));
                    pq.add(new Pair(curr.node.left, curr.row + 1, curr.col - 1));
                }

                if (curr.node.right != null) {
                    q.add(new Pair(curr.node.right, curr.row + 1, curr.col + 1));
                    pq.add(new Pair(curr.node.right, curr.row + 1, curr.col + 1));
                }

                q.remove();
            }
        }

        List<List<Integer>> res = new ArrayList<>();

        while (!pq.isEmpty()) {
            List<Integer> ls = new ArrayList<>();
            int curr_col = pq.peek().col;
            while (!pq.isEmpty() && pq.peek().col == curr_col) {
                ls.add(pq.poll().node.val);
            }
            res.add(ls);
        }
        return res;
    }

    Comparator<Pair> com = new Comparator<Pair>() {
        public int compare(Pair A, Pair B) {
            int colCompare = Integer.compare(A.col, B.col);
            if (colCompare != 0)
                return colCompare;
            else {
                int rowCompare = Integer.compare(A.row, B.row);
                if (rowCompare != 0)
                    return rowCompare;
                else
                    return Integer.compare(A.node.val, B.node.val);
            }
        }
    };
}

// intution : normal bfs , just store (node,row,col) in pq during bfs,
// reterive from pq first same col,if same then then based on level,if same
// level then what is smaller
// put in in list ,, make curr col to keep all these in same list // all same
// col will be retrieved one by one
// afther each other// ek ke baaad same col unless diff col as its pq i made
// smaller col retrieve first// if same col put
// in same list
