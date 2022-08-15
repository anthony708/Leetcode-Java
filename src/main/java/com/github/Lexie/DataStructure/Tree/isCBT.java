/*
 * @Author: Anthony
 * @Date: 2022-08-14 14:24:17
 * @LastEditTime: 2022-08-14 14:35:24
 */
package com.github.Lexie.DataStructure;

import java.util.LinkedList;
import java.util.Queue;

import com.github.Lexie.Utils.TreeNode;

public class isCBT {
    // is Complete Binary Tree

    public static boolean isCBT (TreeNode head) {
        if (head == null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode left = cur.left;
            TreeNode right = cur.right;

            boolean flag = false; // mark 是否遇到第一个左右孩子不双全的节点
            if ((right != null && left == null) || (flag && (left != null || right != null)))
                return false;

            if (left != null) {
                queue.add(left);
            }
            if (right != null) {
                queue.add(right);
            }
            if (left != null && right == null) {
                flag = true;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        // head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);
        head.left.right.left = new TreeNode(8);

        System.out.println(isCBT(head));
    }
}
