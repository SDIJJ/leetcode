package 链表.基本操作;

import 链表.ListNode;

/**
 * @Description: 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * @author: Arnold
 * @since: 2019/4/5 9:02
 * @version: v1.0.0
 */
public class 删除排序链表中的重复元素83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)
            return head;
        ListNode temp=head;
        while (temp.next!=null){
            ListNode next=temp.next;
            if(temp.val==next.val)
                temp.next=next.next;
            else
                temp=temp.next;
        }
        return head;
    }
}
