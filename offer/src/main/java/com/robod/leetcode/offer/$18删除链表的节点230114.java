package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $18删除链表的节点230114
 * @Description 简单：https://leetcode.cn/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 * @Author Robod
 * @Date 2023/1/14 23:07
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $18删除链表的节点230114 {

    public ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) {
            return head.next;
        }

        ListNode p = head;
        while (p.next != null && p.next.val != val) {
            p = p.next;
        }
        if (p.next == null) {
            return head;
        }

        p.next = p.next.next;

        return head;
    }

}
