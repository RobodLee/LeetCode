package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $142环形链表II220421
 * @Description 中等。https://leetcode.cn/problems/linked-list-cycle-ii/
 * @Author Robod
 * @Date 2022/4/21 20:02
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $142环形链表II220421 {

    public ListNode detectCycle(ListNode head) {
        Map<ListNode, Boolean> map = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            if (map.get(cur) == null) { //没被访问过，放入map中
                map.put(cur, true);
            } else {
                return cur; //访问过，返回cur
            }
            cur = cur.next;
        }
        return null;    //链表走到末尾，没有环，返回null
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;
        new $142环形链表II220421().detectCycle(n1);
    }

}
