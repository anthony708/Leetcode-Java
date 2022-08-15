/*
 * @Author: Anthony
 * @Date: 2022-08-14 14:23:56
 * @LastEditTime: 2022-08-14 15:57:45
 */
package com.github.Lexie.DataStructure;

import java.util.Stack;

import com.github.Lexie.Utils.TreeNode;

public class isBST {
    // is Binary Search Tree: 搜索二叉树, 中序遍历有序
    public static int preValue =  Integer.MIN_VALUE;

    public static boolean isBST(TreeNode head) {
        if (head == null) return true;

        boolean isLeftBST = isBST(head.left);
        if (!isLeftBST) {
            return false;
        }
        if (head.value < preValue) {
            return false;
        } else {
            preValue = head.value;
        }
        return isBST(head.right);
    }

    public static boolean isBST2(TreeNode head) {
        if (head == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        int preValue = Integer.MIN_VALUE;
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.left;
            } else {
                head = stack.pop();
                if (head.value < preValue) {
                    return false;
                } else {
                    preValue = head.value;
                }
                head = head.right;
            }
        }
        return true;
    }

    // 递归实现 BST
    public static boolean isBST3(TreeNode head) {
        return process(head).isBST;
    }

    public static class ReturnType {
        public int min;
        public int max;
        public boolean isBST;
        public ReturnType(int mi, int ma, Boolean isB) {
            min = mi;
            max = ma;
            isBST = isB;
        }
    }

    public static ReturnType process(TreeNode head) {
        if (head == null) return null;

        ReturnType leftData = process(head.left);
        ReturnType rightData = process(head.right);

        int min = head.value;
        int max = head.value;
        
        if (leftData != null) {
            min = Math.min(min, leftData.min);
            max = Math.max(max, leftData.max);
        }
        if (rightData != null) {
            min = Math.min(min, rightData.min);
            max = Math.max(max, rightData.max);
        }
        
        boolean isBST = true;
        if (leftData != null && (!leftData.isBST || leftData.max >= head.value)) {
            isBST = false;
        }
        if (rightData != null && (!rightData.isBST || rightData.min <= head.value)) {
            isBST = false;
        }
        return new ReturnType(min, max, isBST);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(8);
        head.left = new TreeNode(2);
        head.right = new TreeNode(10);
        head.left.left = new TreeNode(1);
        head.left.right = new TreeNode(3);
        head.right.left = new TreeNode(9);
        head.right.right = new TreeNode(12);

        System.out.println(isBST(head));
        System.out.println(isBST2(head));
        System.out.println(isBST3(head));
    }
}
