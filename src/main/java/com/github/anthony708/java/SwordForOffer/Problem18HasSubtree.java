package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/9/4.
 */

/*
    输入两棵二叉树A，B，判断B是不是A的子结构
        第一步在A树中找到B树根节点一样值的节点R
        第二步判断A以R为根节点的子树是否和B树一样结构
 */

public class Problem18HasSubtree {
    public boolean hasSubtree(TreeNode root1, TreeNode root2) {

        boolean flag = false;

        if (root1 != null && root2 != null) {
            if (root1.val == root2.val) {
                flag = isSubtree(root1, root2);
            }
            if (!flag) {
                flag = hasSubtree(root1.left, root2);
            }
            if (!flag) {
                flag = hasSubtree(root1.right, root2);
            }
        }

        return flag;
    }

    public boolean isSubtree(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null) return false;
        if (root2 == null) return true;
        if (root1.val != root2.val) {
            return isSubtree(root1.left, root2.left) && isSubtree(root1.right, root2.right);
        }
        return false;
    }
}
