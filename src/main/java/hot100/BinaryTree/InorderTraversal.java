package hot100.BinaryTree;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import hot100.utils.Node;
import hot100.utils.TreeNode;

public class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    public void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public void preorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        res.add(root.val);
        inorder(root.left, res);
        inorder(root.right, res);
    }

    public void postorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }

        inorder(root.left, res);
        inorder(root.right, res);
        res.add(root.val);
    }

    // 栈迭代的方式虽然提高了效率, 但是嵌套循环不易理解, 介绍一种"颜色标记法"
    // 使用颜色标记节点的状态, 新节点为白色, 已访问的节点为灰色
    // 如果遇到的节点为白色, 则将其标记为灰色, 然后将其右子节点, 自身, 左子结点依次入栈
    // 如果遇到节点为灰色, 则将节点的值输出

    public List<Integer> inorderTraversal_2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Deque<Node> stack = new LinkedList<>();
        
        if (root == null) {
            return null;
        }

        stack.push(new Node(root, 1));
        while (!stack.isEmpty()) {
            Node cur = stack.pop();
            if (cur.node == null) {
                continue;
            }
            if (cur.color == 1) {
                stack.push(new Node(cur.node.right, 1));
                stack.push(new Node(cur.node, 2));
                stack.push(new Node(cur.node.left, 1));
            } else {
                res.add(stack.pop().node.val);
            }
        }
        return res;
    }
}
