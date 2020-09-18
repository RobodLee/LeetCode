package com.robod.interview;

import com.robod.entity.ListNode;

/**
 * @author Robod
 * @date 2020/8/5 18:08
 * 返回倒数第 k 个节点
 * 双指针游走法
 */
public class $02_02_kthToLast {

    public int kthToLast(ListNode head, int k) {
        ListNode p = head;  //前指针
        ListNode q = head;  //后指针
        while(k-->0)p=p.next;
        while(p!=null){
            p = p.next;
            q = q.next;
        }
        return q.val;
    }

}
