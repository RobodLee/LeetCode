package com.robod.leetcode.two_pointers;

import com.robod.entity.ListNode;

/**
 * @author Robod
 * @date 2020/8/20 9:32
 * 删除链表的倒数第N个节点
 */
public class $19_removeNthFromEnd {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode p1 = p;
        ListNode p2 = p;
        while(n-- >= 0) {
            p2 = p2.next;
        }
        while(p2 != null) {
            p1 = p1.next;
            p2 = p2.next;
        }
        p1.next = p1.next.next;
        return p.next;
    }

}
