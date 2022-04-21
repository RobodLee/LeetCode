package com.robod.leetcode;

import com.robod.entity.ListNode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Robod
 * @date 2022/4/21 20:02
 * @description
 */
public class $142环形链表II {

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
        new $142环形链表II().detectCycle(n1);
    }

}
