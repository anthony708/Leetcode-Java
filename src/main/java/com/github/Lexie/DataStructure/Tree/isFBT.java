/*
 * @Author: Anthony
 * @Date: 2022-08-14 15:11:45
 * @LastEditTime: 2022-08-14 16:25:17
 */
package com.github.Lexie.DataStructure;

import com.github.Lexie.Utils.TreeNode;

public class isFBT {
    // Full Binary Tree: 深度 height, 节点个数 N, 满足 N = 2 ^ height - 1

    public static boolean isFBT(TreeNode head) {
        if (head == null) return true;
        return process(head).nodes == (1 << process(head).height) - 1;
    }

    public static class ReturnType {
        public int height;
        public int nodes;
        public ReturnType(int h, int n) {
            height = h;
            nodes = n;
        }
    } 

    public static ReturnType process(TreeNode head) {
        if (head == null) return new ReturnType(0, 0);

        ReturnType leftData = process(head.left);
        ReturnType rightData = process(head.right);

        int height = Math.max(leftData.height, rightData.height) + 1;
        int nodes = leftData.nodes + rightData.nodes + 1;
  
        return new ReturnType(height, nodes);
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        head.left = new TreeNode(2);
        head.right = new TreeNode(3);
        head.left.left = new TreeNode(4);
        head.left.right = new TreeNode(5);
        head.right.left = new TreeNode(6);
        head.right.right = new TreeNode(7);

        System.out.println(isFBT(head));
        // System.out.println((1 << 3) - 1);
    }
}
