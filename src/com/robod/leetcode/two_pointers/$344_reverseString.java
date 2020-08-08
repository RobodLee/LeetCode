package com.robod.leetcode.two_pointers;

/**
 * @author Robod
 * @date 2020/8/8 9:22
 * 反转字符串
 */
public class $344_reverseString {

    public void reverseString(char[] s) {
        char temp;
        int left = 0;
        int right = s.length-1;
        while(left<right) {
            temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

}
