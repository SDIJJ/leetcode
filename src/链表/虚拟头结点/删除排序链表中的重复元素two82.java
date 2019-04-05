package 链表.虚拟头结点;

import 链表.ListNode;

/**
 * @Description: 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 * @author: Arnold
 * @since: 2019/4/5 15:26
 * @version: v1.0.0
 */
public class 删除排序链表中的重复元素two82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy1 = new ListNode(0);
        dummy1.next = head;
        ListNode cur = dummy1;
        while (cur.next != null) {
            boolean flag = false;
            ListNode next = cur.next;
            while (next.next != null && next.val == next.next.val) {
                ListNode delNode = next;
                next = next.next;
                delNode = null;
                cur.next = next.next;
                flag = true;
            }
            if (flag == false)
                cur = cur.next;
        }
        return dummy1.next;
    }

    public static void main(String[] args) {
        System.out.println(new 删除排序链表中的重复元素two82().deleteDuplicates(new ListNode(new int[]{1, 2, 3, 3, 4, 4, 5})));
    }
}
