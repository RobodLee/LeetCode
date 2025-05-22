package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

public class $86分隔链表250522 {

    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode();
        ListNode large = new ListNode();

        ListNode smallPointer = small;
        ListNode largePointer = large;

        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                smallPointer.next = node;
                smallPointer = smallPointer.next;
            } else {
                largePointer.next = node;
                largePointer = largePointer.next;
            }
            node = node.next;
        }
        smallPointer.next = large.next;
        largePointer.next = null;
        return small.next;
    }

}
