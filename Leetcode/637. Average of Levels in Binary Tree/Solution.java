import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<Double> averageOfLevels(TreeNode root) {
        return BFS(root);
    }

    public List<Double> BFS(TreeNode node) {
        Queue<TreeNode> queue = new LinkedList<>();

        List<Double> sum = new ArrayList<>();
        if (node == null)
            return sum;

        queue.add(node);

        while (!queue.isEmpty()) {
            int size = queue.size();

            double levelsum = 0;
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.peek();
                if (curr.left != null)
                    queue.add(curr.left);
                if (curr.right != null)
                    queue.add(curr.right);

                levelsum += queue.remove().val;
            }
            sum.add(levelsum / size);
        }

        return sum;
    }
}
