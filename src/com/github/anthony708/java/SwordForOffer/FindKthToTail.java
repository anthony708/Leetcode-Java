package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ListNode;

/**
 * Created by Anthony on 16/4/27.
 */

/*
    设置两个指针, 首先第一个指针走k-1步, 第二个指针开始走;
    在第一个指针到链表尾部时, 第二个指针恰好走到倒数第k个.
 */
public class FindKthToTail {
    public ListNode FindKthToTail(ListNode head, int k) {
        if (head == null || k <= 0) return null;
        ListNode first = head;
        ListNode second = head;
        for (int i = 0; i < k - 1; i++) {
            if (first.next != null) {
                first = first.next;
            } else {
                return null;
            }
        }
        while (first.next != null) {
            first = first.next;
            second = second.next;
        }
        return second;
    }
}
