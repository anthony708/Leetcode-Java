package TopInterviewQuestions;

/*
    104. Maximum Depth of Binary Tree
    Easy
    2019-07-26
 */

import Util.TreeNode;

public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        return treeLevel(root);
    }

    public int treeLevel(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLevel = treeLevel(root.left);
        int rightLevel = treeLevel(root.right);
        if (leftLevel < rightLevel) {
            return rightLevel + 1;
        } else {
            return leftLevel + 1;
        }
    }
}
