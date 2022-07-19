package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/9/13.
 */
/*
    输入一颗二叉树的根节点, 判断该二叉树是不是平衡二叉树. 二叉树任意节点的左右字数深度相差不超过1, 则为平衡二叉树.
        后序遍历二叉树的每一个节点, 遍历到一个节点之前就已经得到它的左右子树深度.
 */
public class Problem39IsBalanced {
    private boolean isBalanced = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return isBalanced;
    }
    public int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if (Math.abs(left - right) > 1) {
            isBalanced = false;
        }
        return left > right ? (left + 1) : (right + 1);
    }
}
