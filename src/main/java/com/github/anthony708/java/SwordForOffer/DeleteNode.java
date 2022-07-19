package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ListNode;

/**
 * Created by Anthony on 16/4/26.
 */
public class DeleteNode {
    public void deleteNode(ListNode head, ListNode deListNode) {
        //链表或删除的节点是否为空
        if (head == null || deListNode == null) return;

        //是否只有一个节点
        if (deListNode == head) {
            head = null;
        } else {

            //是否是尾节点
            if (deListNode.next == null) {
                ListNode curNode = head;
                while (head.next.next != null) {
                    curNode = curNode.next;
                }
                curNode.next = null;
            } else {
                deListNode.val = deListNode.next.val;
                deListNode.next = deListNode.next.next;
            }
        }
    }
}
