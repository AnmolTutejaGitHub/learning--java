class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        TreeNode[] res = new TreeNode[1];
        DFS(original, cloned, target, res);
        return res[0];
    }

    public void DFS(TreeNode o, TreeNode c, TreeNode t, TreeNode[] r) {
        if (o == null)
            return;

        if (c.val == t.val) {
            r[0] = c;
            return;
        }

        DFS(o.left, c.left, t, r);
        DFS(o.right, c.right, t, r);
    }
}