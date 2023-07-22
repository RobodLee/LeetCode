package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $83删除排序链表中的重复元素230214
 * @Description 简单。https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
 * @Author Robod
 * @Date 2023/2/14 15:39
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $83删除排序链表中的重复元素230214 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }

        return res;
    }

}
