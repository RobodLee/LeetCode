package com.robod.leetcode.interview6;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $0207链表相交220420
 * @Description 简单。https://leetcode-cn.com/problems/intersection-of-two-linked-lists-lcci/
 * @Author Robod
 * @Date 2022/4/20 9:32
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $0207链表相交220420 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode curA = headA;
        ListNode curB = headB;
        int lenA = 0;   //链表A的长度
        int lenB = 0;   //链表B的长度
        while (curA != null) {  //求链表A的长度
            curA = curA.next;
            lenA++;
        }
        while (curB != null) {
            curB = curB.next;   //求链表B的长度
            lenB++;
        }
        curA = headA;
        curB = headB;
        if (lenA < lenB) {  //使curA指向较长的链表
            int tempLen = lenA;
            lenA = lenB;
            lenB = tempLen;

            ListNode tempNode = curA;
            curA = headB;
            curB = tempNode;
        }

        int lenGap = lenA - lenB;   //两个链表的长度差
        while (lenGap-- != 0) {
            curA = curA.next;
        }
        while (curA != null) {      //让curA和curB在同一起点上（末尾位置对齐）
            if (curA == curB) {
                return curA;        //如果两个结点相等，返回
            }
            curA = curA.next;
            curB = curB.next;
        }
        return null;                //没有相等结点，返回null
    }

}
