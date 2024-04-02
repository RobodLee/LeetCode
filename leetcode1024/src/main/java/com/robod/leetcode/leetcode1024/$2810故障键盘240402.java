package com.robod.leetcode.leetcode1024;

/**
 * @Description 字符串
 * @Degree 简单
 * @Link :https://leetcode.cn/problems/faulty-keyboard
 * @Author Robod
 * @Date 2024/4/2 10:57
 */
public class $2810故障键盘240402 {

    public String finalString(String s) {
        if (s == null || s.isEmpty()) {
            return "";
        }

        StringBuilder builder = new StringBuilder();
        char[] sCharArray = s.toCharArray();

        for (char c : sCharArray) {
            if (c == 'i') {
                builder.reverse();
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

}
