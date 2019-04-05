package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * @author: Arnold
 * @since: 2019/4/5 11:09
 * @version: v1.0.0
 */
public class 两数相加2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode head = new ListNode(-100);
        ListNode cur = head;

        int temp = 0;
        ListNode node;
        while (q != null || p != null) {
            if (q != null && p != null)
                node = new ListNode(p.val + q.val + temp);
            else if ((q == null) && p != null)
                node = new ListNode(p.val + temp);
            else
                node = new ListNode(q.val + temp);
            if (node.val >= 10) {
                temp = 1;
                node.val = node.val % 10;
            } else
                temp = 0;
            cur.next = node;
            if (q != null)
                q = q.next;
            if (p != null)
                p = p.next;
            cur = cur.next;
        }
        if (temp != 0)
            cur.next = new ListNode(temp);

        return head.next;
    }

    public static void main(String[] args) {
        System.out.println(new 两数相加2().addTwoNumbers(new ListNode(new int[]{5}), new ListNode(new int[]{5})));
    }
}
