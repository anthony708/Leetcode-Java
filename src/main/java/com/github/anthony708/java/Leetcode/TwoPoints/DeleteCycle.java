/*
 * @Author: Anthony
 * @Date: 2021-08-31 23:26:47
 * @LastEditTime: 2021-08-31 23:52:55
 */
package com.github.anthony708.java.LeetCode.TwoPoints;

import com.github.anthony708.java.utils.ListNode;

/**
 * 142. 环形链表 II
 * 给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
 * 如果 pos 是 -1，则在该链表中没有环。注意，pos 仅仅是用于标识环的情况，并不会作为参数传递到函数中。
 * 
 * 分析: 检测链表是否有环: 两个指针一个slow一次一步, 一个fast一次两步, 看两个指针是否会重合, 如果重合则有环;
 *      两个指针第一次重合时, 将fast指针指向链表头, 此时改为一次一步, 则两个指针第二次重合时fast指针走过的长度则为环的起点.
 */

public class DeleteCycle {
    public ListNode detectCycle(ListNode head) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                ListNode q2 = head;
                ListNode q1 = p1;
                while (q1 != q2) {
                    q1 = q1.next;
                    q2 = q2.next;
                }
                return q1;
            }
        }
        return null;
    }
}
