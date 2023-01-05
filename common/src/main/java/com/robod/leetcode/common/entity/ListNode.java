package com.robod.leetcode.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ListNode
 * @Description 链表结点
 * @Author Robod
 * @Date 2022/3/13 9:44
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListNode {

    /**
     * 结点值
     */
    public int val;

    /**
     * next指针
     */
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

}
