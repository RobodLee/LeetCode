package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * https://leetcode.cn/problems/rotate-list
 */
public class $61旋转链表250519 {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }

        k = k % length;

        while (k-- > 0) {
            head = move(head);
        }
        return head;
    }

    private ListNode move(ListNode head) {
        ListNode node = head;

        while (node.next.next != null) {
            node = node.next;
        }

        ListNode temp = node.next;
        node.next = null;
        temp.next = head;
        return temp;

    }

}
