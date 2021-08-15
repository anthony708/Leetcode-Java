package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.TreeNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Anthony on 16/5/4.
 */

/*
    输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。
    递归
    前序遍历, 每次将节点添加到list中, 直到叶子节点, 计算是否完成target;
    若不符合则向上寻找节点, 每次要删除最后一个节点的值.
 */

public class Problem25FindPath {

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target) {

        ArrayList<ArrayList<Integer>> pathList = new ArrayList<ArrayList<Integer>>();
        if (root == null) return pathList;
        Stack<Integer> stack = new Stack<>();
        findPath(root, target, stack, pathList);
        return pathList;
    }

    public void findPath(TreeNode root, int target, Stack<Integer> stack, ArrayList<ArrayList<Integer>> pathList) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                ArrayList<Integer> list = new ArrayList<>();
                for (int i : stack) {
                    list.add(new Integer(i));
                }
                list.add(new Integer(root.val));
                pathList.add(list);
            }
        } else {
            stack.push(new Integer(root.val));
            findPath(root.left, target - root.val, stack, pathList);
            findPath(root.right, target - root.val, stack, pathList);
            stack.pop();
        }
    }
}
