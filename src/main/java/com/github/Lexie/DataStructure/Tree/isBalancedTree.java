/*
 * @Author: Anthony
 * @Date: 2022-08-14 15:12:41
 * @LastEditTime: 2022-08-14 15:24:12
 */
package com.github.Lexie.DataStructure;

import com.github.Lexie.Utils.TreeNode;

public class isBalancedTree {
    // 左树和右树高度差不超过 1

    public static boolean isBalancedTree(TreeNode head) {
        return process(head).isBalanced;
    }

    public static class ReturnType {
        public boolean isBalanced;
        public int height;
        public ReturnType(boolean isB, int hei) {
            isBalanced = isB;
            height = hei;
        }
    }

    public static ReturnType process(TreeNode head) {
        if (head == null) return new ReturnType(true, 0);

        ReturnType leftData = process(head.left);
        ReturnType rightData = process(head.right);
        int height = Math.abs(leftData.height - rightData.height);
        boolean isBalanced = leftData.isBalanced && rightData.isBalanced && height < 2;

        return new ReturnType(isBalanced, height);

    }
}
