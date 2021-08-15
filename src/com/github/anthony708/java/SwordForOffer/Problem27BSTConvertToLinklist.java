package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/9/7.
 */

/*
    输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。
        中序遍历二叉树
 */
public class Problem27BSTConvertToLinklist {
    public TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) return null;
        if (pRootOfTree.left == null && pRootOfTree.right == null) return pRootOfTree;

        // 1. 将左子树构造成双链表, 并返回链表头结点
        TreeNode left = convert(pRootOfTree.left);
        TreeNode p = left;

        // 2. 定位左子树最后一个节点
        while (p != null && p.right != null) {
            p = p.right;
        }

        // 3. 如果左子树不为空, 将root加到左子树最后一个节点
        if (left != null) {
            p.right = pRootOfTree;
            pRootOfTree.left = p;
        }

        // 4. 将右子树构造成双链表
        TreeNode right = convert(pRootOfTree.right);

        // 5. 右子树不为空, 将右子树的头结点加到root
        if (right != null) {
            pRootOfTree.right = right;
            right.left = pRootOfTree;
        }
        return left != null ? left : pRootOfTree;
    }
}
