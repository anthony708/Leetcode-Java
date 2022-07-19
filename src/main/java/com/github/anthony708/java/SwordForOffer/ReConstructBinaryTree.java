package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

import java.util.Arrays;

/**
 * Created by Anthony on 16/4/13.
 */
public class ReConstructBinaryTree {
    public static class Solution {
        public static TreeNode reConstructBinaryTree(int [] pre, int [] in) {
            if (pre == null || in == null) {
                return null;
            }
            return ConstructCore(pre, 0, pre.length-1, in, 0, in.length-1);
        }
        public static TreeNode ConstructCore(int[] pre, int preLeft, int preRight, int[] in, int inLeft, int inRight) {
            if (preLeft > preRight || inLeft > inRight) {
                return null;
            }
            TreeNode root = new TreeNode(pre[preLeft]);
            for (int i = inLeft; i <= inRight; i++) {
                if (pre[preLeft] == in[i]) {
                    root.left = ConstructCore(pre, preLeft+1, preLeft+i-inLeft, in, inLeft, i-1);
                    root.right = ConstructCore(pre,i+1+preLeft-inLeft, preRight, in, i+1, inRight);
                }
            }
            return root;
        }

        public static void main(String[] args) {
            int[] pre = {1,2,4,7,3,5,6,8};
            int[] in = {4,7,2,1,5,3,8,6};
            System.out.println(reConstructBinaryTree(pre,in));
        }
    }
}
