package 链表.虚拟头结点;

import 链表.ListNode;

/**
 * @Description: 删除链表中等于给定值 val 的所有节点。
 * @author: Arnold
 * @since: 2019/4/5 15:02
 * @version: v1.0.0
 */
public class 移除链表的元素203 {
    public ListNode removeElements(ListNode head, int val) {

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                ListNode delNode = cur.next;
                cur.next = delNode.next;
                delNode = null;
            } else
                cur = cur.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        System.out.println(new 移除链表的元素203().removeElements(new ListNode(new int[]{1, 1}), 1));
    }
}
