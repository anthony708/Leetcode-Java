package com.github.anthony708.java.LeetCode.Archive;

import java.util.*;
import java.lang.Integer;
/**
 * Created by Anthony on 15/11/9.
 */
public class BinaryTreeTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; };
    }

    //递归前序遍历
    public static void preOrderRec(TreeNode root) {
        System.out.print(root.val);
        preOrderRec(root.left);
        preOrderRec(root.right);
    }

    //递归中序遍历
    public static void inOrderRec(TreeNode root) {
        preOrderRec(root.left);
        System.out.print(root.val);
        preOrderRec(root.right);
    }

    //递归后续遍历
    public static void postOrderRec(TreeNode root) {
        preOrderRec(root.left);
        preOrderRec(root.right);
        System.out.print(root.val);
    }

    //用栈实现前序遍历
    public List<Integer> preOrderStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if(root == null) return list;

        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right != null ) {
                stack.push(node.right);
            }
            if(node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    //用栈实现中序遍历
    public List<Integer> InorderStack(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null) return list;
        TreeNode node = root;
        while (!stack.isEmpty() || node != null) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            if (!stack.isEmpty()) {
                node = stack.pop();
                list.add(node.val);
                node = node.right;
            }
        }
        return list;
    }

    //层序遍历
    public List<List<Integer>> levelOrderStack(TreeNode root) {
        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        List<Integer> levelList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();


        if(root == null) return resList;
        int currentLevelCount = 1;
        int nextLevelCount = 0;

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            currentLevelCount--;
            levelList.add(currentNode.val);
            
            if(currentNode.left != null) {
                queue.add(currentNode.left);
                nextLevelCount++;
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
                nextLevelCount++;
            }
            if(currentLevelCount == 0) {
                currentLevelCount = nextLevelCount;
                nextLevelCount = 0;
                resList.add(levelList);
                levelList = new ArrayList<>();
            }

        }
//        return resList;
        //结果resList的翻转
        List<List<Integer>> result = new ArrayList<>();
        for (int i= resList.size()-1; i>=0; --i){
            result.add(resList.get(i));
        }
        return result;
    }


}
