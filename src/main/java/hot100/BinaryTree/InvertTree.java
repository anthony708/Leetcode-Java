package hot100.BinaryTree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

/*
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。

 */

import hot100.utils.TreeNode;

public class InvertTree {
    public TreeNode invertTree(TreeNode root) {
        // 从根节点开始, 递归的对树进行遍历, 从叶子节点开始翻转
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public TreeNode invertTreeByQueue(TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            TreeNode temp = node.left;
            node.left = node.right;
            node.right = temp;
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return root;
    }

}
