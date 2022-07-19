package Tree;

import Util.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 144. Binary Tree Preorder Traversal
 * Medium
 * @author zhuduan
 * 2019/05/05
 */

public class BinaryTreePreorderTraversal {

    // Solution 1: Stack

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return list;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    // Solution 2

    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        preHelper(root, list);
        return list;
    }

    public void preHelper(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        preHelper(root.left, list);
        preHelper(root.right, list);
    }

    // Solution 3: Recursive

    public List<Integer> preorderTraversal3(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if (root != null) {
            list.add(root.val);
            list.addAll(preorderTraversal3(root.left));
            list.addAll(preorderTraversal3(root.right));
        }
        return list;
    }

}
