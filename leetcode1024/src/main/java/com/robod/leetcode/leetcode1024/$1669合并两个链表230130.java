package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $1669合并两个链表230130
 * @Description 中等。https://leetcode.cn/problems/merge-in-between-linked-lists/
 * @Author Robod
 * @Date 2023/1/30 20:02
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $1669合并两个链表230130 {

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aPre = null;
        ListNode bNext = null;

        ListNode p = list1;
        int i = 0;
        while (p != null && i <= b) {
            if (i == a - 1) {
                aPre = p;
            } else if (i == b) {
                bNext = p.next;
            }
            p = p.next;
            i++;
        }

        aPre.next = list2;

        p = list2;
        while (p.next != null) {
            p = p.next;
        }
        p.next = bNext;

        return list1;
    }

}
