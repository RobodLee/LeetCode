package com.robod.leetcode.offer;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $50第一个只出现一次的字符230128
 * @Description 简单。https://leetcode.cn/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * @Author Robod
 * @Date 2023/1/28 10:08
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $50第一个只出现一次的字符230128 {

    public char firstUniqChar(String s) {
        Map<Character, Boolean> map = new HashMap<>();

        // 第一遍遍历，将只出现一次的字符置为true，超过一次的置为false
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (map.get(curChar) == null) {
                map.put(curChar, true);
            } else {
                map.put(curChar, false);
            }
        }

        // 第二遍遍历，遇到的第一个true即为第一个只出现一次的字符
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);

            if (map.get(curChar)) {
                return curChar;
            }
        }

        return ' ';
    }

}
