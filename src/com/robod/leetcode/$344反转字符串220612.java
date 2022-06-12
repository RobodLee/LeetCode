package com.robod.leetcode;

/**
 * @author Robod
 * @date 2022/6/12 11:46
 * @description :https://leetcode.cn/problems/reverse-string/
 */
public class $344反转字符串220612 {

    public void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while (l < r) {
            char temp = s[l];
            s[l] = s[r];
            s[r] = temp;
            l++;
            r--;
        }
    }

}
