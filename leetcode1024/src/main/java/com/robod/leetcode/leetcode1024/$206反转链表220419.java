package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $206反转链表220419
 * @Description 简单。https://leetcode-cn.com/problems/reverse-linked-list/
 * @Author Robod
 * @Date 2022/4/19 15:23
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $206反转链表220419 {

    //改变指针的指向，使得原本指向下一个节点的指针指向上一个结点
    public ListNode reverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        ListNode temp;
        while (cur != null) {
            temp = cur.next;    //保存cur的下一个节点
            cur.next = pre;     //反转
            //更新pre和cur
            pre = cur;
            cur = temp;
        }
        return pre;
    }

}
