package com.github.anthony708.java.SwordForOffer;

/**
 * Created by Anthony on 16/4/28.
 */

import com.github.anthony708.java.utils.ListNode;

public class ListMerge {
    public ListNode Merge(ListNode list1, ListNode list2) {

        // 判断是否为空链表
        if (list1 == null) {
            return list2;
        } else if (list2 == null){
            return list1;
        }

        ListNode mergedHead = null;
        if (list1.val < list2.val) {
            mergedHead = list1;
            mergedHead.next = Merge(list1.next, list2);
        } else {
            mergedHead = list2;
            mergedHead.next = Merge(list1, list2.next);
        }
        return mergedHead;
    }
}
