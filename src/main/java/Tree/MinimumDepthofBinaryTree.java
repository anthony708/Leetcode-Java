package main.java.Tree;

import main.java.Util.TreeNode;

/**
 * #111 Minimum Depth of Binary Tree
 * Easy
 * @author zhuduan
 * 2018/09/27
 */

public class MinimumDepthofBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        if (root.left != null && root.right != null) {
            return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
        } else {
            return Math.max(minDepth(root.left), minDepth(root.right)) + 1;
        }
    }
}
