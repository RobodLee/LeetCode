package com.robod.leetcode.string;

import java.util.Arrays;

/**
 * @author Robod
 * @date 2020/8/1 17:15
 */
public class _415_addStrings {

    public String addStrings(String num1, String num2) {
        int lengthDiff = num1.length() - num2.length();
        char[] zeroChars = new char[Math.abs(lengthDiff)];
        Arrays.fill(zeroChars, '0');
        String zeros = new String(zeroChars);
        if (lengthDiff > 0) {
            num2 = zeros + num2;
        }
        if (lengthDiff < 0) {
            num1 = zeros + num1;
        }
        char[] num1Chars = num1.toCharArray();
        char[] num2Chars = num2.toCharArray();
        int temp = 0;
        char[] chars = new char[num1.length() + 1];
        Arrays.fill(chars,'0');
        for (int i = num1.length() - 1; i >= 0; i--) {
            int j = num1Chars[i] -'0' + num2Chars[i]-'0' + temp;
            chars[i+1] += j % 10;
            temp = j/10;
        }
        chars[0] +=temp;
        if (chars[0] == '0'){
            return new String(chars).substring(1,chars.length);
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        System.out.println(new _415_addStrings().addStrings("6666", "7777"));
    }
}
