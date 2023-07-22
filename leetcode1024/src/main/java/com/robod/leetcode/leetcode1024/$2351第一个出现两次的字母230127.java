package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $2351第一个出现两次的字母230127
 * @Description 简单。https://leetcode.cn/problems/first-letter-to-appear-twice/
 * @Author Robod
 * @Date 2023/1/27 19:20
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $2351第一个出现两次的字母230127 {

    public char repeatedCharacter(String s) {
        int[] alphabet = new int[26];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] = alphabet[s.charAt(i) - 'a'] + 1;
            if (alphabet[s.charAt(i) - 'a'] >= 2) {
                return s.charAt(i);
            }
        }

        return ' ';
    }


}
