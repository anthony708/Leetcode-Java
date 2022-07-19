package LinkedList;

import Util.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 817. Linked List Components
 * Medium
 * @author zhuduan
 * 2019/05/20
 */

/*
    1. if cur node is contained in G, then find its component continuously
    2 .when the node is not contained in G, then break and find next component.
 */

public class LinkedListComponents {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (int i: G) {
            set.add(i);
        }
        while (head != null) {
            if (set.contains(head.val)) {
                res++;
            }
            while (head != null && set.contains(head.val)) {
                head = head.next;
            }
            if (head != null) {
                head = head.next;
            }
        }
        return res;
    }
}
