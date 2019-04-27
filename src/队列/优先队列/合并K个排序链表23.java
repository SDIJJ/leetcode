package 队列.优先队列;


import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Description: 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 * @author: Arnold
 * @since: 2019/4/19 15:35
 * @version: v1.0.0
 */
public class 合并K个排序链表23 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null, cur = null;
        Queue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        Arrays.stream(lists).filter(e -> e != null).forEach(e -> queue.add(e));
        while (!queue.isEmpty()) {
            ListNode top = queue.poll();
            if (top.next != null)
                queue.add(top.next);
            if (head == null) {
                head = top;
                cur = top;
            } else {
                cur.next = top;
                cur = cur.next;
            }
        }
        return head;
    }
}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


