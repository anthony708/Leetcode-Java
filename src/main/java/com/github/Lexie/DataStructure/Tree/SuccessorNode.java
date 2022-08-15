/*
 * @Author: Anthony
 * @Date: 2022-08-14 17:11:08
 * @LastEditTime: 2022-08-14 17:23:21
 */
package com.github.Lexie.DataStructure.Tree;

public class SuccessorNode {
    public static class Node {
        public Node left;
        public Node right;
        public Node parent;
        public int value;

        public Node(int v) {
            value = v;
        }
    }

    /*
     * 分为两种情况:
     * 1. 如果一个节点有右树, 它的后继一定是右树最左侧节点
     * 2. 如果一个节点没有右树
     *      2.1 它的后继是向上找到第一个有左树的节点
     *      2.2 它是中序遍历最后一个节点, 后继为 null
     */
    public static Node successorNode(Node node) {
        if (node == null) return node;

        if (node.right != null) {
            return getLeftMost(node.right);
        } else {
            Node parent = node.parent;
            while(parent != null && parent.left != null) {
                node = parent;
                parent = node.parent;
            }
            return parent;
        }

    }

    public static Node getLeftMost(Node node) {
        if (node == null) return null;
        while(node != null) {
            node = node.left;
        }
        return node;
    }
}




