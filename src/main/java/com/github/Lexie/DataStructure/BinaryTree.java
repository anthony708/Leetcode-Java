/*
 * @Author: Anthony
 * @Date: 2022-08-10 00:42:11
 * @LastEditTime: 2022-08-10 00:49:12
 */
package com.github.Lexie.DataStructure;

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
    }
}
