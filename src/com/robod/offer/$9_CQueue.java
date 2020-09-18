package com.robod.offer;

import java.util.Stack;

/**
 * @author Robod
 * @date 2020/9/18 15:00
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class $9_CQueue {

    class CQueue {

        private Stack<Integer> stack1;
        private Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void appendTail(int value) {
            stack1.push(value);
        }

        public int deleteHead() {
            if(stack2.empty()) {
                while(!stack1.empty()) {
                    stack2.push(stack1.pop());
                }
            }
            if(!stack2.empty()) {
                return stack2.pop();
            }
            return -1;
        }
    }

}
