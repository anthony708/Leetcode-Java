package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/9/4.
 */

/*
    操作给定的二叉树，将其变换为源二叉树的镜像。
        前序遍历树的每个节点, 若遍历到的节点有子结点, 就交换两个子结点;
        交换完所有非叶子节点的左右子结点后, 就得到树的镜像.
 */

public class Problem19Mirror {
    public void mirror(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        if (root.left != null) {
            mirror(root.left);
        }
        if (root.right != null) {
            mirror(root.right);
        }
    }
}
