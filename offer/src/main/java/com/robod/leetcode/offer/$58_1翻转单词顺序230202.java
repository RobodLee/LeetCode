package com.robod.leetcode.offer;

/**
 * @ClassName $58_1翻转单词顺序230202
 * @Description 简单。https://leetcode.cn/problems/fan-zhuan-dan-ci-shun-xu-lcof/
 * @Author Robod
 * @Date 2023/2/2 00:35
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $58_1翻转单词顺序230202 {

    public String reverseWords(String s) {
        String[] sArray = s.trim().split(" ");
        StringBuilder builder = new StringBuilder();

        for (int i = sArray.length - 1; i >= 0; i--) {
            String curStr = sArray[i];
            if (!"".equals(curStr)) {
                for (int j = 0; j < curStr.length(); j++) {
                    builder.append(curStr.charAt(j));
                }
                builder.append(" ");
            }
        }

        return builder.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(new $58_1翻转单词顺序230202().reverseWords("a good   example"));
    }
}
