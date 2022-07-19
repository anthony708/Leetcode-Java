package main.java.TopInterviewQuestions;

/*
    94. Binary Tree Inorder Traversal
    Medium
    2019-08-07
 */

import main.java.Util.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        reverseHelper(root, res);
        return res;
    }

    private void reverseHelper(TreeNode node, List<Integer> list) {
        if (node != null) {
            reverseHelper(node.left, list);
            list.add(node.val);
            reverseHelper(node.right, list);
        }
    }
}
