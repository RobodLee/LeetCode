package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $22链表中倒数第k个节点230115
 * @Description 简单:https://leetcode.cn/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 * @Author Robod
 * @Date 2023/1/15 18:10
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $22链表中倒数第k个节点230115 {

    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode rear = head;
        while (k > 1) {
            rear = rear.next;
            k--;
        }
        while (rear.next != null) {
            head = head.next;
            rear = rear.next;
        }

        return head;
    }
}
