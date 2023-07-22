package com.robod.leetcode.offer;

/**
 * @ClassName $05替换空格220612
 * @Description :https://leetcode.cn/problems/ti-huan-kong-ge-lcof/
 * @Author Robod
 * @Date 2022/6/12 21:00
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $05替换空格220612 {

    public String replaceSpace(String s) {
        StringBuilder str = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.append(' ').append(' ');    //没当原字符串遇到一个空格就将新字符串扩充两个空格长度
            }
        }
        if (str.length() == s.length()) {
            return s; //没有空格，直接返回
        }
        //有空格，双指针法进行替换
        char[] chars = new String(str).toCharArray();
        int i = s.length() - 1;     //指向原字符串最后一个位置
        int j = str.length() - 1;   //指向新字符串最后一个位置
        while (i >= 0) {
            if (s.charAt(i) == ' ') {
                chars[j--] = '0';
                chars[j--] = '2';
                chars[j] = '%';
            } else {
                chars[j] = s.charAt(i);
            }
            i--;
            j--;
        }
        return new String(chars);
    }

}
