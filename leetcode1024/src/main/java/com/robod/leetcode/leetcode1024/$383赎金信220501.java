package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $383赎金信220501
 * @Description 简单。https://leetcode-cn.com/problems/ransom-note/
 * @Author Robod
 * @Date 2022/5/1 19:57
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $383赎金信220501 {

    public boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        for (char c : ransomNote.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : magazine.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (record[i] > 0) {
                return false;
            }
        }
        return true;
    }

}
