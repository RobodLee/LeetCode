package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $24反转链表230115
 * @Description TODO
 * @Author Robod
 * @Date 2023/1/15 18:23
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $24反转链表230115 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode p = head;
        ListNode q = p.next;

        p.next = null;

        while (q != null) {
            ListNode r = q.next;

            q.next = p;
            p = q;
            q = r;
        }

        return p;
    }

}
