package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ListNode;

/*
    输入两个链表，找出它们的第一个公共结点。
    1. 遍历两个链表, 找到它们的长度
    2. 将长链表先走若干步, 使两个链表现在的长度一样长
    3. 一起遍历两个链表, 找到相同节点
 */

/**
 * Created by Anthony on 16/6/16.
 */
public class Problem37FindFirstCommonNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        int length1 = getLength(pHead1);
        int length2 = getLength(pHead2);
        ListNode pLongHead = pHead1;
        ListNode pShortHead = pHead2;
        int lengthDif = Math.abs(length1 - length2);
        if (length1 < length2) {
            pLongHead = pHead2;
            pShortHead = pHead1;
        }
        for (int i = 0; i < lengthDif; i++) {
            pLongHead = pLongHead.next;
        }
        while (pLongHead != null && pShortHead != null) {
            if (pLongHead.val == pShortHead.val) {
                return pLongHead;
            } else {
                pLongHead = pLongHead.next;
                pShortHead = pShortHead.next;
            }
        }
        return null;
    }
    public int getLength(ListNode pHead) {
        int length = 0;
        ListNode node = pHead;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
