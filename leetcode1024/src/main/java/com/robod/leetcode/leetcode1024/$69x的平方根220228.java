package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $69x的平方根220228
 * @Description 简单。https://leetcode.cn/problems/sqrtx/
 * @Author Robod
 * @Date 2022/2/28 17:27
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $69x的平方根220228 {

    private int mySqrt(int x) {
        long left = 1;
        long right = x;
        long middle;
        long num;
        while (left <= right) {
            middle = (left + right) / 2;
            num = middle * middle;
            if (num == x) {
                return (int) middle;
            } else if (num > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        int x = 2147483647;
        int result = new $69x的平方根220228().mySqrt(x);
        System.out.println(result);
    }

}
