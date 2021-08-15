package com.github.anthony708.java.SwordForOffer;

import java.util.Arrays;

/**
 * Created by Anthony on 16/5/4.
 */

/*
    输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。

 */

public class Problem24VerifySquenceOfBST {
    public static boolean verifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) return false;
        int root = sequence[sequence.length - 1];
        int i = 0;
        for (; i < sequence.length - 1; i++) {
            if (sequence[i] > root) {
                break;
            }
        }
        int j = i;
        for (; j < sequence.length - 1; j++) {
            if (sequence[j] < root) {
                return false;
            }
        }
        boolean leftFlag = true;
        if (i > 0) {
            leftFlag = verifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));

        }
        boolean rightFlag = true;
        if (i < sequence.length - 1) {
            rightFlag = verifySquenceOfBST(Arrays.copyOfRange(sequence, i, sequence.length - 1));
        }
        return leftFlag && rightFlag;
    }

    public static void main(String[] args) {
        int[] sequence = {5,4,3,2,1};
        System.out.println(verifySquenceOfBST(sequence));
    }
}
