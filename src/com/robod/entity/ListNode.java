package com.robod.entity;

/**
 * @author Robod
 * @date 2020/8/5 18:09
 * 链表节点
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int[] numbers) {
        this.val = numbers[0];
        ListNode node = this;
        for (int i = 1; i < numbers.length; i++) {
            node.next = new ListNode(numbers[i]);
            node = node.next;
        }
    }

    public void print() {
        ListNode node = this;
        do {
            System.out.print(node.val + " ");
            node = node.next;
        } while (node != null);
        System.out.println();
    }

}
