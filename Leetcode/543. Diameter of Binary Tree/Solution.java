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

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        int max[] = new int[1];
        DFS(root, max);
        return max[0];
    }

    public void DFS(TreeNode node, int[] max) {
        if (node == null)
            return;

        DFS(node.left, max);
        max[0] = Math.max(max[0], DFSHeight(node.left) + DFSHeight(node.right));
        DFS(node.right, max);
    }

    public int DFSHeight(TreeNode node) {
        if (node == null)
            return 0;

        return 1 + Math.max(DFSHeight(node.left), DFSHeight(node.right));
    }
}
