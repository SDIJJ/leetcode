package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 * @author: Arnold
 * @since: 2019/4/5 7:40
 * @version: v1.0.0
 */
public class 翻转链表two92 {
    public ListNode reverseBetween(ListNode head, int m, int n) {

        //设置伪头结点
        ListNode fakeHead = new ListNode(-100);
        fakeHead.next = head;

        /**
         * 规划边界 (,first]  [first+1,last-l]   [last,)
         */

        //需要翻转部分前的最后一个元素 (,first]~
        ListNode first = fakeHead;
        for (int i = 0; i < m - 1; i++)
            first = first.next;

        //需要翻转部分后的第一个元素 ~[last,)
        ListNode last = fakeHead;
        for (int i = 0; i <= n; i++)
            last = last.next;

        //翻转部分:[first+1,last-1]
        ListNode cur = first.next;
        ListNode pre = last;
        for (int i = m; i < n; i++) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        cur.next = pre;
        first.next = cur;
        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        ListNode two = new ListNode(5);
        head.next = two;
        new 翻转链表two92().reverseBetween(head, 1, 2);
    }
}


