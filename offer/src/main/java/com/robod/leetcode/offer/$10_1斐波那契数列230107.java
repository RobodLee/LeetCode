package com.robod.leetcode.offer;

/**
 * @ClassName $10_I斐波那契数列
 * @Description 简单。https://leetcode.cn/problems/fei-bo-na-qi-shu-lie-lcof/
 * @Author Robod
 * @Date 2023/1/7 22:27
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $10_1斐波那契数列230107 {

    /**
     * 自底向上
     */
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0;    // f(0)
        int b = 1;    // f(1)
        int c = 0;

        for (int i = 2; i <= n; i++) {
            c = (a + b) % 1000000007;  //f(2)，以此类推
            a = b;
            b = c;
        }
        return c;
    }

}
