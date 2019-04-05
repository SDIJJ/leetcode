package 链表.进阶;

import 链表.ListNode;

/**
 * @Description: 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * @author: Arnold
 * @since: 2019/4/5 16:17
 * @version: v1.0.0
 */
public class 两两交换链表中的节点24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            ListNode node1 = cur.next;
            ListNode node2 = node1.next;

            node1.next = node2.next;
            node2.next = node1;
            cur.next = node2;

            cur = node1;
        }
        return dummy.next;
    }
}
