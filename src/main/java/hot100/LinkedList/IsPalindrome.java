package hot100.LinkedList;

import java.util.ArrayList;
import java.util.List;

/*
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */

import hot100.utils.ListNode;

public class IsPalindrome {
    public boolean isPalindrome(ListNode head) {
        // 分为两步骤: 
        // 1. 复制链表的值到数组列表中
        // 2. 双指针判断是否回文

        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
}
