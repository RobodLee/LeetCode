package com.robod.leetcode.leetcode1024;

import java.util.Stack;

/**
 * @ClassName $376摆动序列230206
 * @Description 中等，贪心。https://leetcode.cn/problems/wiggle-subsequence/
 * @Author Robod
 * @Date 2023/2/6 13:50
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $376摆动序列230206 {

    static class CQueue {

        Stack<Integer> stack1;
        Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        // 入队时将元素放入栈1
        public void appendTail(int value) {
            stack1.add(value);
        }

        // 出队时将栈1元素放入栈2，删除栈2的栈首元素，再将元素放入栈1
        public int deleteHead() {
            if(stack1.isEmpty()) {
                return -1;
            }

            while(!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            int res = stack2.pop();
            while(!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }

            return res;
        }
    }

}
