package 链表.进阶;

import 链表.ListNode;

/**
 * @Description: 对链表进行插入排序。
 * @author: Arnold
 * @since: 2019/4/6 19:38
 * @version: v1.0.0
 */
public class 对链表进行插入排序147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            ListNode pre = dummy;//每次while循环，都将pre置为dummy节点
            //这一步是为了找到当前的cur的节点要插在哪个节点后面
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            //当前节点的下一个节点的值为pre节点的后一个节点
            cur.next = pre.next;
            //pre节点的后一个节点指向cur节点
            pre.next = cur;
            //移动cur的节点到next节点，再次while循环
            cur = next;
        }
        return dummy.next;
    }

}
