package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $541反转字符串II220612
 * @Description 简单。https://leetcode.cn/problems/reverse-string-ii/
 * @Author Robod
 * @Date 2022/6/12 20:33
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $541反转字符串II220612 {

    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        //i: 每次翻转的起始位置
        for (int i = 0; i < s.length(); i += (2 * k)) {
            // 剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符
            if (i + k < s.length()) {
                for (int l = i, r = i + k - 1; l < r; l++, r--) {
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                }
            } else {
                //剩余字符少于 k 个，则将剩余字符全部反转
                for (int l = i, r = s.length() - 1; l < r; l++, r--) {
                    char temp = chars[l];
                    chars[l] = chars[r];
                    chars[r] = temp;
                }
            }
        }
        return new String(chars);
    }

}
