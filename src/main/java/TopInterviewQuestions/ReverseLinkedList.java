package TopInterviewQuestions;

import Util.ListNode;

/*
    206. Reverse Linked List
    Easy
    2019-08-08
 */

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next;

        while (cur != null) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }

        return pre;
    }
}
