package hot100.LinkedList;

import java.util.HashSet;
import java.util.Set;

/*
 * 移除未排序链表中的重复节点。保留最开始出现的节点。

示例1：

 输入：[1, 2, 3, 3, 2, 1]
 输出：[1, 2, 3]
示例2：

 输入：[1, 1, 1, 1, 2]
 输出：[1, 2]
 */

import hot100.utils.ListNode;

public class RemoveDuplicatedNodes {
    public ListNode removeDuplicatedNodes(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        Set<Integer> set = new HashSet<>();
        set.add(head.val);
        ListNode pos = head;
        while (pos.next != null) {
            ListNode cur = pos.next;
            if (set.contains(cur.val)) {
                pos = pos.next;
            } else {
                set.add(cur.val);
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }
}
