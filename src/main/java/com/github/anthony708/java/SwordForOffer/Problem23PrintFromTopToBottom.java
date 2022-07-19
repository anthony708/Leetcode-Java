package com.github.anthony708.java.SwordForOffer;
import com.github.anthony708.java.utils.TreeNode;

import java.util.ArrayList;

/**
 * Created by Anthony on 16/5/4.
 */
/*
    从上往下打印出二叉树的每个节点，同层节点从左至右打印。
        树的层序遍历
        打印根节点时, 将它的左右节点保存到队列的队尾, 每次从队列中取队头重复操作
 */

public class Problem23PrintFromTopToBottom {
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<TreeNode> queue = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove(0);
            result.add(node.val);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return result;
    }
}
