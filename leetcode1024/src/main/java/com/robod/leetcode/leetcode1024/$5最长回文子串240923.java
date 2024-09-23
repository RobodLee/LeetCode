package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $5最长回文子串240923
 * @Description TODO
 * @Author Robod
 * @Date 2024/9/23 下午9:20
 */
public class $5最长回文子串240923 {

    public String longestPalindrome(String s) {
        String maxLengthLoopStr = "";

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (j + 1 - i > maxLengthLoopStr.length()) {
                    String subStr = s.substring(i, j + 1);
                    if (isLoopStr(subStr)) {
                        maxLengthLoopStr = subStr;
                    }
                }
            }
        }
        return maxLengthLoopStr;
    }

    private boolean isLoopStr(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) == str.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new $5最长回文子串240923().longestPalindrome("babad"));
    }

}
