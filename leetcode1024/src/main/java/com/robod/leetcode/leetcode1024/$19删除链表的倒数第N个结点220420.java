package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.ListNode;

/**
 * @author Robod
 * @date 2022/4/20 9:00
 * @description 链接：https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 *
 * 中等。
 */
public class $19删除链表的倒数第N个结点220420 {

    //例如：
    //dummy -> 1 -> 2 -> 3 -> 4 -> 5
    //n=2,删除倒数第2个结点4
    //dummy -> 1 -> 2 -> 3 -> 5
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode fast = dummyNode;
        ListNode slow = dummyNode;

        //n=2,fast向后移动2为，指向2
        while (n-- != 0 && fast != null) {
            fast = fast.next;
        }
        fast = fast.next;   //fast再向后移动一位，指向3，共移动n+1位
        //fast，slow一起向后移动，直到fast指向null，此时slow指向待删除结点的前一个，也就是3
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next; //删除4
        return dummyNode.next;
    }
}
