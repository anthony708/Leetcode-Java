package com.github.anthony708.java.SwordForOffer;

import com.github.anthony708.java.utils.ComplexListNode;

/**
 * Created by Anthony on 16/5/6.
 */

/*
    采用辅助空间的方法:
    第一步, 复制每个节点N创建N', 建立<N, N'>的哈希表;
    第二步, 根据S找到S', 由于有哈希表时间复杂度为O(1).

    不采用辅助空间的方法:
    第一步, 同上, 把N'链接在N后面;
    第二步, 复制, N指向S那么N'指向S';
    第三步, 把长链表拆分成两个;
 */


public class Problem26ComplexListNodeClone {

    public ComplexListNode Clone(ComplexListNode pHead) {
        // 复制节点
        ComplexListNode pNode = pHead;
        while (pNode != null) {
            ComplexListNode pClone = new ComplexListNode(pNode.data);
            pClone.next = pNode.next;
            pClone.sibling = null;

            pNode.next = pClone;
            pNode = pClone.next;
        }

        // 复制sibling指针
        pNode = pHead;
        while (pNode != null) {
            ComplexListNode pClone = pNode.next;
            if (pNode.sibling != null) {
                pClone.sibling = pNode.sibling.next;
            }
            pNode = pClone.next;
        }

        // 删除原点
        pNode = pHead;
        ComplexListNode pSecond = pHead.next;
        while (pNode != null) {
            ComplexListNode pNext = pNode.next;
            pNode.next = pNext.next;
            pNode = pNext.next;
            if (pNode.next != null) {
                pNext.next = pNode.next;
            }
        }
        return pSecond;
    }

}
