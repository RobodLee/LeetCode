package com.robod.leetcode.linked_list;

import com.robod.entity.ListNode;

/**
 * @author Robod
 * @date 2020/8/7 9:14
 * 删除链表中的节点
 */
public class $237_deleteNode {

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
