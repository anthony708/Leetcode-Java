/*
 * @Author: Anthony
 * @Date: 2022-08-10 00:42:11
 * @LastEditTime: 2022-08-11 23:01:51
 */
package com.github.Lexie.DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import com.github.Lexie.Utils.TreeNode;

public class BinaryTree {
    public static void preOrderRecur(TreeNode head) {
        if (head == null) return;
        System.out.print(head.value + " ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }

    public static void inOrderRecur(TreeNode head) {
        if (head == null) return;
        inOrderRecur(head.left);
        System.out.print(head.value + " ");
        inOrderRecur(head.right);
    }

    public static void posOrderRecur(TreeNode head) {
        if (head == null) return;
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.print(head.value + " ");
    }

    public static void preOrderNonRecur(TreeNode head) {
        if (head == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            System.out.print(cur.value + " ");
            if (cur.right != null) {
                stack.add(cur.right);
            }
            if (cur.left != null) {
                stack.add(cur.left);
            }
        }
    }

    public static void inOrderNonRecur(TreeNode head) {
        if (head == null) return;
        Stack<TreeNode> stack = new Stack<>();
        while (head != null || !stack.isEmpty()) {
            if (head != null) {
                stack.add(head);
                head = head.left;
            } else {
                head = stack.pop();
                System.out.print(head.value + " ");
                head = head.right;
            }
        }
    }

    public static void posOrderNonRecur(TreeNode head) {
        if (head == null) return;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.isEmpty()) {
            TreeNode cur = stack1.pop();
            stack2.push(cur);
            if (cur.left != null) {
                stack1.push(cur.left);
            }
            if (cur.right != null) {
                stack1.push(cur.right);
            }
        }
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().value + " ");
        }
    }

    public static void levelRecursive(TreeNode head) {
        if (head == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while(!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        System.out.println(" ============================= Recursive ======================== ");
        System.out.println(" ============================= PreOrder ======================== ");
        preOrderRecur(head);
        System.out.println();
        System.out.println(" ============================= InOrder ======================== ");
        inOrderRecur(head);
        System.out.println();
        System.out.println(" ============================= PosOrder ======================== ");
        posOrderRecur(head);
        System.out.println();

        System.out.println(" ============================= Non-Recursive ======================== ");
        System.out.println(" ============================= PreOrder ======================== ");
        preOrderNonRecur(head);
        System.out.println();
        System.out.println(" ============================= InOrder ======================== ");
        inOrderNonRecur(head);
        System.out.println();
        System.out.println(" ============================= PosOrder ======================== ");
        posOrderNonRecur(head);
        System.out.println();

        System.out.println(" ============================= Level Recursive ======================== ");
        levelRecursive(head);
    }
}
