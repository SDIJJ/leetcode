package 链表.基本操作;

import 链表.ListNode;

import java.util.Stack;

/**
 * @Description: 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 * @author: Arnold
 * @since: 2019/4/5 12:52
 * @version: v1.0.0
 */
public class 两数相加two445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode head = new ListNode(-100);
        ListNode cur = head;
        int temp = 0;
        while (!stack1.empty() || !stack2.empty()) {
            ListNode node;
            if (!stack1.empty() && !stack2.empty()) {
                node = new ListNode(stack1.pop() + stack2.pop() + temp);
            } else if (!stack1.empty() && stack2.empty())
                node = new ListNode(stack1.pop() + temp);
            else
                node = new ListNode(stack2.pop() + temp);

            if (node.val > 9) {
                node.val = node.val % 10;
                temp = 1;
            } else
                temp = 0;
            cur.next = node;
            cur = cur.next;

        }
        if (temp != 0)
            cur.next = new ListNode(temp);

        //翻转链表

        ListNode pre = null;
        ListNode current = head.next;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }

    public static void main(String[] args) {
        System.out.println(new 两数相加two445().addTwoNumbers(new ListNode(new int[]{7, 2, 4, 3}), new ListNode(new int[]{5, 6, 4})));
    }
}
