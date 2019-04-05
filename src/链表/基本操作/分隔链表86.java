package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 给定一个链表和一个特定值 x，对链表进行分隔，使得所有小于 x 的节点都在大于或等于 x 的节点之前。你应当保留两个分区中每个节点的初始相对位置。
 * @author: Arnold
 * @since: 2019/4/5 9:08
 * @version: v1.0.0
 */
public class 分隔链表86 {
    public ListNode partition(ListNode head, int x) {
        ListNode fakePre = new ListNode(-100);
        ListNode temp1 = fakePre;

        ListNode fakeNext = new ListNode(-100);
        ListNode temp2 = fakeNext;

        ListNode cur = head;

        while (cur != null) {
            if (cur.val < x) {
                temp1.next = cur;
                temp1 = temp1.next;

            } else {
                temp2.next = cur;
                temp2 = temp2.next;

            }
            cur = cur.next;
        }
        temp1.next = null;
        temp2.next = null;
        temp1.next = fakeNext.next;
        ListNode newHead = fakePre.next;
        return newHead;
    }

    public static void main(String[] args) {
        System.out.println(new 分隔链表86().partition(new ListNode(new int[]{1, 4, 3, 2, 5, 2}), 3).toString());
    }
}
