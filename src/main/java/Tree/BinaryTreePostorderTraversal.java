package main.java.Tree;

import main.java.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 145. Binary Tree Preorder Traversal
 * Hard
 * @author zhuduan
 * 2019/05/05
 */

public class BinaryTreePostorderTraversal {

    // Solution 1: Recursive
    public List<Integer> postorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        postorderHelper(root, list);
        return list;
    }

    public void postorderHelper(TreeNode root, List<Integer> list) {
        if (root != null) {
            postorderHelper(root.left, list);
            postorderHelper(root.right, list);
            list.add(root.val);
        }
    }
}
