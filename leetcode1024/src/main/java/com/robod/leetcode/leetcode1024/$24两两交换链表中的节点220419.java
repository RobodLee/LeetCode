package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $24两两交换链表中的节点220419
 * @Description 中等。模拟过程。https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author Robod
 * @Date 2022/4/19 15:42
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $24两两交换链表中的节点220419 {

    //virtual -> 1 -> 2 -> 3 -> 4
    //              ↓
    //virtual -> 2 -> 1 -> 4 -> 3
    public ListNode swapPairs(ListNode head) {
        ListNode virtualNode = new ListNode();    //虚拟头结点
        virtualNode.next = head;
        ListNode cur = virtualNode; //cur指向待交换的两个结点的前一个节点

        while (cur.next != null && cur.next.next != null) {
            //以第1轮为例进行说明：
            ListNode temp1 = cur.next;  //指向结点1
            ListNode temp2 = cur.next.next.next;    //指向结点3

            cur.next = cur.next.next;   //virtual的next指针指向结点2
            cur.next.next = temp1;      //结点2的next指针指向结点1
            cur.next.next.next = temp2; //结点1的next指针指向结点3
            //第一轮交换结束后链表：virtual -> 2 -> 1 -> 3 -> 4

            cur = cur.next.next;    //cur指向结点1，进行下一轮交换
        }
        return virtualNode.next;
    }

}
