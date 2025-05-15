package com.robod.leetcode.leetcode1024;


public class $28找出字符串中第一个匹配项的下标250516 {

    public int strStr(String haystack, String needle) {
        char[] haystackCharArray = haystack.toCharArray();
        char[] needleCharArray = needle.toCharArray();

        for (int i = 0; i + needleCharArray.length <= haystackCharArray.length; i++) {
            boolean flag = true;
            for (int j = 0; j < needle.length(); j++) {
                if (haystackCharArray[i + j] != needleCharArray[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new $28找出字符串中第一个匹配项的下标250516().strStr("aa", "aaaa"));
    }

}
