package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $2325解密消息230201
 * @Description 简单。https://leetcode.cn/problems/decode-the-message/
 * @Author Robod
 * @Date 2023/2/1 19:10
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $2325解密消息230201 {

    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");

        // 替换表
        Map<Character, Character> replaceMap = new HashMap<>();

        int order = 0;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (null == replaceMap.get(c)) {
                replaceMap.put(c, (char) ('a' + order++));
            }
        }

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (' ' == c) {
                builder.append(c);
            } else {
                builder.append(replaceMap.get(c));
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new $2325解密消息230201().decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

}
