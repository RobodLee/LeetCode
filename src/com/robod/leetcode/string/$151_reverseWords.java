package com.robod.leetcode.string;

/**
 * @author Robod
 * @date 2020/8/2 9:13
 * 翻转字符串里的单词
 */
public class $151_reverseWords {

    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder result = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && temp.length() > 0) {
                result.append(temp.reverse()).append(" ");
                temp.setLength(0);
            } else if (s.charAt(i) != ' ') {
                temp.append(s.charAt(i));
            }
        }
        result.append(temp.reverse());
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(new $151_reverseWords().reverseWords(""));
    }

}
