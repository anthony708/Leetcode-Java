/*
 * @Author: Anthony
 * @Date: 2022-08-14 16:33:42
 * @LastEditTime: 2022-08-14 17:01:14
 */
package com.github.Lexie.DataStructure.Tree;

import java.util.HashMap;
import java.util.HashSet;

import com.github.Lexie.Utils.TreeNode;

public class LowestCommonAncester {
    public static TreeNode lca(TreeNode head, TreeNode o1, TreeNode o2) {
        // fatherMap: 用于记录所有节点和它的父节点
        HashMap<TreeNode, TreeNode> fatherMap = new HashMap<>();
        fatherMap.put(head, head);
        process(head, fatherMap);
        
        // set: 用于记录每个节点至 head 的链
        HashSet<TreeNode> set = new HashSet<>();
        TreeNode cur = o1;
        while (fatherMap.get(cur) != head) {
            set.add(cur);
            cur = fatherMap.get(cur);
        }
        set.add(head);
        
        cur = o2;
        while(!set.contains(fatherMap.get(cur))) {
            cur = fatherMap.get(cur);
        }
        return cur;
    }

    public  static void process(TreeNode head, HashMap<TreeNode, TreeNode> fatherMap) {
        if (head == null) return;

        fatherMap.put(head.left, head);
        fatherMap.put(head.right, head);
        process(head.left, fatherMap);
        process(head.right, fatherMap);
    }

    public static TreeNode lca2(TreeNode head, TreeNode o1, TreeNode o2) {
        if (head == null || head == o1 || head == o2) return head;

        TreeNode left = lca2(head.left, o1, o2);
        TreeNode right = lca2(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }
}
