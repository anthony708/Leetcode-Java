package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

/**
 * Created by Anthony on 16/9/12.
 */

/*
    输入一颗二叉树, 求树的深度. 从根节点到叶节点依次经过的节点形成树的一条路径, 最长路径的长度为树的深度.
        如果树只有根节点, 则深度为1; 若根节点只有左子树或只有右子树, 那深度为左子树深度或右子树深度加一;
        如果既有左子树又有右子树, 则为左子树和右子树深度较大值加一
 */

public class Problem39TreeDepth {
    public int treeDepth(TreeNode pRoot) {
        if (pRoot == null) return 0;
        int nLeft = treeDepth(pRoot.left);
        int nRight = treeDepth(pRoot.right);
        return nLeft > nRight ? (nLeft + 1) : (nRight + 1);
    }
}
