package com.robod.leetcode;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @author Robod
 * @date 2022/4/19 15:23
 * @description 链接：https://leetcode-cn.com/problems/reverse-linked-list/
 * <p>
 * 简单。双指针法
 */
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
