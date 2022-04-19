package com.robod.leetcode;

import com.robod.entity.ListNode;

/**
 * @author Robod
 * @date 2022/4/19 0:02
 * @description 链接：https://leetcode-cn.com/problems/design-linked-list
 * <p>
 * 中等。链表
 */
public class $707设计链表220419 {

    ListNode head;  //虚拟头结点
    int count;  //元素的数量

    public $707设计链表220419() {
        head = new ListNode();
        count = 0;
    }

    public int get(int index) {
        ListNode cur = head;
        //cur指向第index个结点
        while (index >= 0) {
            cur = cur.next;
            if (cur == null) {
                return -1;
            }
            index--;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        count++;
    }

    public void addAtTail(int val) {
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(val);
        count++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {    //index小于0，在头部插入结点
            addAtHead(val);
        } else if (count == index) {    //index等于链表长度，添加到链表末尾
            addAtTail(val);
        } else if (index < count) {
            ListNode newNode = new ListNode(val);
            ListNode cur = head;
            //cur指向待插入位置的前一个节点
            while (--index >= 0) {
                cur = cur.next;
            }
            newNode.next = cur.next;
            cur.next = newNode;
            count++;
        }
        //大于链表长度，则不会插入节点
    }

    public void deleteAtIndex(int index) {
        //由于index的范围是[0, count)，如果大于等于count，说明越界
        if (index < count) {
            ListNode cur = head;
            //cur指向待删除结点的前一个节点
            while (--index >= 0) {
                cur = cur.next;
            }
            cur.next = cur.next.next;
            count--;
        }
    }

}
