package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ListNode;

/**
 * Created by Anthony on 16/4/27.
 */
public class ReverseList {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode preNode = null;
        ListNode curNode = head;
        while (curNode != null) {
            // 保存cur.next节点
            ListNode nextNode = curNode.next;
            curNode.next = preNode;
            preNode = curNode;
            curNode = nextNode;
        }
        return preNode;
    }
}
