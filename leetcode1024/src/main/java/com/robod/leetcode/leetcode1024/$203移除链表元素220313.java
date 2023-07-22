package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @ClassName $203移除链表元素220313
 * @Description 简单。https://leetcode-cn.com/problems/remove-linked-list-elements/
 * @Author Robod
 * @Date 2022/3/13 10:17
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $203移除链表元素220313 {

    /**
     * 额外创建一个虚拟的头结点virtualNode，使得virtualNode.next=head
     * 然后执行遍历删除操作，最后返回virtualNode.next即可
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode virtualNode = new ListNode();
        virtualNode.next = head;
        ListNode cur = virtualNode;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return virtualNode.next;
    }
}
