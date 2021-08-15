package com.github.anthony708.java.SwordForOffer;

import java.util.Stack;

/**
 * Created by Anthony on 16/9/5.
 */

/*
    定义栈的数据结构，请在该类型中实现一个能够得到栈最小元素的min函数。
        压入最小元素前把最小元素保存起来, 而且每次都把最小值压入辅助栈
 */

public class Problem21StackWithMin {
    int min = Integer.MIN_VALUE;
    Stack<Integer> dataStack = new Stack<>();
    Stack<Integer> minStack = new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        if (node < min || minStack.isEmpty()) {
            minStack.push(node);
            min = node;
        } else {
            minStack.push(min);
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return minStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
