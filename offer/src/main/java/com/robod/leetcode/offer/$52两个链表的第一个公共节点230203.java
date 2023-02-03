package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $52两个链表的第一个公共节点230203
 * @Description 简单。https://leetcode.cn/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * @Author Robod
 * @Date 2023/2/3 22:22
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $52两个链表的第一个公共节点230203 {

    /**
     * 将A中结点都放入map中，遍历B，找到第一个在map中的节点即为公共节点。
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Boolean> map = new HashMap<>();

        while (headA != null) {
            map.put(headA, true);
            headA = headA.next;
        }

        while (headB != null && map.get(headB) == null) {
            headB = headB.next;
        }

        return headB;
    }

}
