package hot100.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import hot100.utils.TreeNode;

public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int l = maxDepth(root.left);
            int r = maxDepth(root.right);
            return Math.max(l, r) + 1;
        }
    }

    public int maxDepth_2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int res = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            while (size > 0) {
                TreeNode node = q.poll();
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
                size--;
            }
            res++;
        }
        return res;
    }
}
