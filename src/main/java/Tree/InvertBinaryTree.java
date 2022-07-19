package Tree;

import Util.TreeNode;

/**
 * 226. Invert Binary Tree
 * Easy
 * @author zhuduan
 * 2019/05/05
 */

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
