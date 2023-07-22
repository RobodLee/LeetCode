package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $151颠倒字符串中的单词220613
 * @Description 中等。https://leetcode.cn/problems/reverse-words-in-a-string/
 * @Author Robod
 * @Date 2022/6/13 15:21
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $151颠倒字符串中的单词220613 {

    public static String reverseWords(String s) {
        s = removeExtraSpaces(s);
        char[] chars = s.toCharArray();
        // 2.翻转整个字符串
        reserve(chars, 0, chars.length - 1);

        for (int start = 0, end = 0; end <= chars.length; end++) {
            if (end == chars.length || chars[end] == ' ') {    //找到每个单词的起始位置，翻转单词
                reserve(chars, start, end - 1);
                start = end + 1;
            }
        }

        return new String(chars);
    }

    /**
     * 1.删除首尾以及中间多余空格。双指针法，时间O(n)，空间O(1)
     */
    public static String removeExtraSpaces(String s) {
        char[] chars = s.toCharArray();
        int slow = 0; //慢指针
        int fast = 0; //快指针

        // 将 fast 指针移动到第一个字符的位置，目的是删除字符串前面的空格
        while (fast < chars.length && chars[fast] == ' ') {
            fast++;
        }

        for (; fast < chars.length; fast++) {
            // 删除中间部分冗余的空格
            if (fast - 1 > 0 && chars[fast - 1] == chars[fast] && chars[fast] == ' ') {
            } else {
                chars[slow++] = chars[fast];
            }
        }

        if (slow - 1 > 0 && chars[slow - 1] == ' ') {
            slow--;
        }

        return new String(chars).substring(0, slow);
    }

    /**
     * 翻转字符串中左闭右闭的区间
     */
    public static char[] reserve(char[] chars, int start, int end) {
        while (start < end) {
            char c = chars[start];
            chars[start] = chars[end];
            chars[end] = c;
            start++;
            end--;
        }
        return chars;
    }

    public static void main(String[] args) {
        String s = "  hello world  ";
        System.out.println(reverseWords(s));
    }
}
