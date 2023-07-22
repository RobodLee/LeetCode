package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $344反转字符串220612
 * @Description 简单。https://leetcode.cn/problems/reverse-string/
 * @Author Robod
 * @Date 2022/6/12 11:46
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $344反转字符串220612 {

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}
