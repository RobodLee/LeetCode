package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $21合并两个有序链表230214
 * @Description 简单。https://leetcode.cn/problems/merge-two-sorted-lists/
 * @Author Robod
 * @Date 2023/2/14 15:05
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $21合并两个有序链表230214 {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode();
        ListNode p = res;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                p.next = list2;
                break;
            }
            if (list2 == null) {
                p.next = list1;
                break;
            }

            if (list1.val < list2.val) {
                p.next = list1;
                list1 = list1.next;
            } else {
                p.next = list2;
                list2 = list2.next;
            }
            p = p.next;
        }

        return res.next;
    }

}
