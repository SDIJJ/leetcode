package 链表.进阶;

import 链表.ListNode;
import 链表.虚拟头结点.合并两个有序的链表21;

/**
 * @Description: 给出一个链表，每 k 个节点一组进行翻转，并返回翻转后的链表。
 * @author: Arnold
 * @since: 2019/4/5 17:11
 * @version: v1.0.0
 */
public class k个一组翻转链表25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pre = null;
        ListNode cur = head;
        ListNode next = null;
        ListNode check = head;
        int j = 0;
        int count = 0;

        //计数
        while (j < k && check != null) {
            check = check.next;
            j++;
        }

        //递归终止条件:链表的长度小于k,直接放回
        if (j != k)
            return head;
        else {
            //翻转k部分链表
            while (count < k && cur != null) {
                next = cur.next;
                cur.next = pre;
                pre = cur;
                cur = next;
                count++;
            }

            //对后边的部分进行操作
            if (next != null)
                head.next = reverseKGroup(cur.next, k);
            return pre;
        }
    }

    public static void main(String[] args) {
        System.out.println(new k个一组翻转链表25().reverseKGroup(new ListNode(new int[]{1, 2, 3, 4, 5}), 2));
    }
}
