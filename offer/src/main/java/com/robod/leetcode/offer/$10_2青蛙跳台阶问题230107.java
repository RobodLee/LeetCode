package com.robod.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $10_II青蛙跳台阶问题
 * @Description 简单。等同于斐波那契问题
 * @Author Robod
 * @Date 2023/1/7 22:32
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $10_2青蛙跳台阶问题230107 {

    Map<Integer, Integer> map;  // 用于存放f(x)的值，避免重复计算

    /**
     * 如果要调到第n阶，那么可以从第n-1阶跳一步，或是从第n-2阶两步。
     * 所以跳到第n阶的跳法就可以看做是跳到 第n-1阶的跳法 + 跳到第n-2阶的跳法 之和
     * 那么该问题就等同于斐波那契数列问题
     * 该解法是自顶向下式的
     */
    public int numWays(int n) {
        map = new HashMap<>();

        return fib(n);
    }

    private int fib(int n) {
        if (n <= 1) {
            return 1;
        }

        int a;  // 用于存放f(n-1)的值
        int b;  // 用于存放f(n-2)的值

        if (map.get(n - 1) != null) {
            a = map.get(n - 1);
        } else {
            a = fib(n - 1);
            map.put(n - 1, a);
        }

        if (map.get(n - 2) != null) {
            b = map.get(n - 2);
        } else {
            b = fib(n - 2);
            map.put(n - 2, b);
        }

        return (a + b) % 1000000007;
    }

    public static void main(String[] args) {
        System.out.println(new $10_2青蛙跳台阶问题230107().numWays(44));
    }

}
