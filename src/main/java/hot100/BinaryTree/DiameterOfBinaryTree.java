package hot100.BinaryTree;

/*
 * 给你一棵二叉树的根节点，返回该树的 直径 。

二叉树的 直径 是指树中任意两个节点之间最长路径的 长度 。这条路径可能经过也可能不经过根节点 root 。

两节点之间路径的 长度 由它们之间边数表示。
 */

import hot100.utils.TreeNode;

public class DiameterOfBinaryTree {
    private int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        // 一条路径的长度 = 经过该路径的节点数 - 1
        // 任意一条路径, 看成某个节点左儿子和右儿子向下遍历的路径拼接, 即 L左子树长度 + R右子树长度
        depth(root);
        int diameter = res;
        return diameter;
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftLen = depth(root.left);
        int rightLen = depth(root.right);
        res = Math.max(leftLen + rightLen, res); // 计算左子树和右子树的最大长度, 后和 res 比较, 更新
        return Math.max(leftLen, rightLen) + 1; // 返回左子树和右子树中的最大长度
    }
}
