package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $25合并两个排序的链表
 * @Description 简单：https://leetcode.cn/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/submissions/
 * @Author Robod
 * @Date 2023/1/15 18:48
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $25合并两个排序的链表230115 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode virtualHead = new ListNode();
        ListNode p = virtualHead;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null) {
            p.next = l1;
        } else {
            p.next = l2;
        }

        return virtualHead.next;
    }

}
