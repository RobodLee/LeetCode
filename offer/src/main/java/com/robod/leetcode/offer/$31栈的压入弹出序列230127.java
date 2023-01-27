package com.robod.leetcode.offer;

import java.util.Stack;

/**
 * @ClassName $31栈的压入弹出序列230127
 * @Description 中等。https://leetcode.cn/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/
 * @Author Robod
 * @Date 2023/1/27 17:26
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $31栈的压入弹出序列230127 {

    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int len = pushed.length;
        int pushIndex = 0;
        int popIndex = 0;

        Stack<Integer> stack = new Stack<>();
        while (true) {
            if (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                // 1.栈非空且栈顶元素等于popIndex所指向元素值，出栈
                stack.pop();
                popIndex++;
            } else if (pushIndex < len) {
                // 2.还有未进栈元素，进栈
                stack.push(pushed[pushIndex++]);
            } else {
                // 3.栈顶元素不等于popIndex所指向元素值 或 已经全部出栈
                break;
            }
        }

        return stack.isEmpty();
    }
}
