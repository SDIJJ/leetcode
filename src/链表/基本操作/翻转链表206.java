package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 翻转链表
 * @author: Arnold
 * @since: 2019/4/5 7:13
 * @version: v1.0.0
 */
public class 翻转链表206 {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}


