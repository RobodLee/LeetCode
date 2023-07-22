package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $58最后一个单词的长度230128
 * @Description 简单。https://leetcode.cn/problems/length-of-last-word/
 * @Author Robod
 * @Date 2023/1/28 09:56
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $58最后一个单词的长度230128 {

    public int lengthOfLastWord(String s) {
        int index = s.length()-1;

        while(index>=0 && s.charAt(index)==' ') {
            index--;
        }

        int lastLen = 0;
        while(index>=0 && s.charAt(index)!=' ') {
            index--;
            lastLen++;
        }

        return lastLen;
    }

}
