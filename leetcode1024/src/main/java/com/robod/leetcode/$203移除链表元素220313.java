package com.robod.leetcode;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @author Robod
 * @date 2022/3/13 10:17
 * @description 链接：https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
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
