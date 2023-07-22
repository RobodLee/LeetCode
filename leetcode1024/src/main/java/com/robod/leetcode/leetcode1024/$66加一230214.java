package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $66加一230214
 * @Description 简单。https://leetcode.cn/problems/plus-one/
 * @Author Robod
 * @Date 2023/2/14 15:38
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $66加一230214 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

}
