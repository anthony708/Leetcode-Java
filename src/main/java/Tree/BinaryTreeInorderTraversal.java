package main.java.Tree;

import main.java.Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 94. Binary Tree Inorder Traversal
 * Medium
 *
 * @author zhuduan
 * 2019/05/05
 */

public class BinaryTreeInorderTraversal {

    // Solution 1: Stack

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        while (!stack.isEmpty() || root != null) {
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            list.add(node.val);
            root = root.right;
        }
        return list;
    }

    // Solution 2: Recursive

    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<>();

        inorderHelper(root, list);
        return list;
    }

    public void inorderHelper(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderHelper(root.left, list);
            list.add(root.val);
            inorderHelper(root.right, list);
        }
    }
}
