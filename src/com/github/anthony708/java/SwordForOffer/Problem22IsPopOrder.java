package com.github.anthony708.java.SwordForOffer;

import java.util.Stack;

/**
 * Created by Anthony on 16/5/4.
 */

/*
    输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。
    假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，序列4，5,3,2,1是该压栈序列对应的一个弹出序列，
    但4,3,5,1,2就不可能是该压栈序列的弹出序列。
        辅助栈
        判断下一个弹出数字是否是栈顶元素: 若是, 则直接弹出; 否则, 将还没入栈的元素入栈, 直到栈顶元素是下一个弹出的数字为止
 */
public class Problem22IsPopOrder {

    public static boolean isPopOrder(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0, j = 0; i < popA.length; i++) {
            stack.push(pushA[i]);

            while (!stack.empty() && (stack.peek() == popA[j])) {
                stack.pop();
                j++;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        System.out.println(isPopOrder(pushA, popA));
    }
}
