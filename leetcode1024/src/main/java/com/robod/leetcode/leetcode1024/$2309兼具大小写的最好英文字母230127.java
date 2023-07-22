package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $2309兼具大小写的最好英文字母230127
 * @Description TODO
 * @Author Robod
 * @Date 2023/1/27 11:52
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $2309兼具大小写的最好英文字母230127 {

    public String greatestLetter(String s) {
        int[] alphabetLower = new int[26];
        int[] alphabetUpper = new int[26];
        for (int i = 0; i < 26; i++) {
            alphabetLower[i] = 0;
            alphabetUpper[i] = 0;
        }

        for (int i = 0; i < s.length(); i++) {
            int indexLower = s.charAt(i) - 'a';
            int indexUpper = s.charAt(i) - 'A';

            if (indexLower >= 0 && indexLower < 26) {
                alphabetLower[indexLower] = alphabetLower[indexLower] + 1;
            }

            if (indexUpper >= 0 && indexUpper < 26) {
                alphabetUpper[indexUpper] = alphabetUpper[indexUpper] + 1;
            }

        }

        for (int i = 25; i >= 0; i--) {
            if (alphabetLower[i] > 0 && alphabetUpper[i] > 0) {
                return String.valueOf((char) ('A' + i));
            }
        }

        return "";
    }

    public static void main(String[] args) {
        System.out.println(new $2309兼具大小写的最好英文字母230127().greatestLetter("aaaaa"));
    }

}
