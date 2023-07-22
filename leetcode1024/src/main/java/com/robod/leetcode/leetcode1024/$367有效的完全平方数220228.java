package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $367有效的完全平方数220228
 * @Description 简单。https://leetcode.cn/problems/valid-perfect-square/
 * @Author Robod
 * @Date 2022/2/28 18:46
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $367有效的完全平方数220228 {

    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        long middle;
        long result;
        while (left <= right) {
            middle = (left + right) / 2;
            result = middle * middle;
            if (result == num) {
                return true;
            }
            if (result < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = new $367有效的完全平方数220228().isPerfectSquare(17);
        System.out.println(result);
    }
}
