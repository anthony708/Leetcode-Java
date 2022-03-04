package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/5/9.
 */
public class Convert {
    protected TreeNode leftLast = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            leftLast = pRootOfTree;
            return pRootOfTree;
        }
        // 将左子树构造成双向链表, 并返回链表头结点
        TreeNode left = Convert(pRootOfTree.left);
        // 左子树不为空, 将当前root追加到左子树链表
        if (left != null) {
            leftLast.right = pRootOfTree;
            pRootOfTree.left = leftLast;
        }
        leftLast = pRootOfTree;
        // 右子树构造成双向链表并返回头结点
        TreeNode right = Convert(pRootOfTree.right);
        // 右子树不为空, 将当前链表追加到root之后
        if (right != null) {
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }
        return left != null ? left : pRootOfTree;
    }
}
