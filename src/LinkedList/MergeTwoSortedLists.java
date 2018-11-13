package LinkedList;

import Util.ListNode;

/**
 * #21 Merge Two Sorted Lists
 * Easy
 * @author zhuduan
 * 2018/09/20
 */

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;
        ListNode mergedList;
        if (l1.val < l2.val) {
            mergedList = l1;
            mergedList.next = mergeTwoLists(l1.next, l2);
        } else {
            mergedList = l2;
            mergedList.next = mergeTwoLists(l1, l2.next);
        }
        return mergedList;
    }
}
