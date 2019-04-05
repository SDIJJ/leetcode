package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 给定一个单链表，把所有的奇数节点和偶数节点分别排在一起。
 * @author: Arnold
 * @since: 2019/4/5 10:02
 * @version: v1.0.0
 */
public class 奇偶链328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode odd = new ListNode(-100);
        ListNode temp1 = odd;
        ListNode even = new ListNode(-100);
        ListNode temp2 = even;
        int count = 1;
        ListNode cur = head;
        while (cur != null) {
            if (count % 2 == 1) {
                temp1.next = cur;
                temp1 = temp1.next;
            } else {
                temp2.next = cur;
                temp2 = temp2.next;
            }
            count++;
            cur = cur.next;
        }
        temp2.next = null;
        temp1.next = even.next;
        return odd.next;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode(new int[]{1, 2, 3, 4, 5,6,7,8});
        System.out.println(new 奇偶链328().oddEvenList(head));
    }
}
