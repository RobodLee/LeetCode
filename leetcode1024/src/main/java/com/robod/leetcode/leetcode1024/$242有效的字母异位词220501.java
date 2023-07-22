package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $242有效的字母异位词220501
 * @Description 简单。https://leetcode-cn.com/problems/valid-anagram/
 * @Author Robod
 * @Date 2022/5/1 19:51
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $242有效的字母异位词220501 {

    public boolean isAnagram(String s, String t) {
        int[] record = new int[26];
        for (char c : s.toCharArray()) {
            record[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            record[c - 'a']--;
        }
        for (int i = 0; i < 26; i++) {
            if (record[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
