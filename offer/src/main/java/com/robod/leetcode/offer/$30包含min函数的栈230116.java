package com.robod.leetcode.offer;

import java.util.Stack;

/**
 * @ClassName $30包含min函数的栈230116
 * @Description 简单：https://leetcode.cn/problems/bao-han-minhan-shu-de-zhan-lcof/
 * @Author Robod
 * @Date 2023/1/16 23:52
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $30包含min函数的栈230116 {

    private class MinStack {

        /**
         * 常规的栈，用于存放元素
         */
        private final Stack<Integer> stack;

        /**
         * 存放最小元素的栈
         */
        private final Stack<Integer> minStack;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (minStack.isEmpty() || x <= minStack.peek()) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                if (stack.peek() > minStack.peek()) {
                    stack.pop();
                } else {
                    stack.pop();
                    minStack.pop();
                }
            }
        }

        public int top() {
            return stack.isEmpty() ? 0 : stack.peek();
        }

        public int min() {
            return minStack.isEmpty() ? 0 : minStack.peek();
        }

    }

}
