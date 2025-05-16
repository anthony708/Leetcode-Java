package hot100.LinkedList;
/* 
import hot100.utils.ListNode;

 * 实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。

注意：本题相对原题稍作改动

示例：

输入： 1->2->3->4->5 和 k = 2
输出： 4
 */

import hot100.utils.ListNode;

public class KthToLast {
    public int kthToLast(ListNode head, int k) {
        int length = 1;
        ListNode temp = head;
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        int p = 0;
        temp = head;
        while (p < length - k) {
            temp = temp.next;
            p++;
        }
        return temp.val;
    }
}

