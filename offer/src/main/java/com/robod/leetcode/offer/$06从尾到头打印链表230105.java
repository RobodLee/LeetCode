package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $06从尾到头打印链表
 * @Description 简单.https://leetcode.cn/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * @Author Robod
 * @Date 2023/1/5 19:48
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $06从尾到头打印链表230105 {

    // 这里的head是链表的第一个数据结点，不是头结点
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }

        // 计算链表长度
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }

        // 遍历链表，将元素放置在数组中
        int[] result = new int[length];
        int index = length - 1;
        p = head;
        while (p != null) {
            result[index] = p.val;
            p = p.next;
            index--;
        }
        return result;
    }

}
