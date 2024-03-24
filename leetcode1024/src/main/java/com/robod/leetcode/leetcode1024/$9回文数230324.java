package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $9回文数230324
 * @Description 简单。https://leetcode.cn/problems/palindrome-number
 * @Author Robod
 * @Date 2024/3/24 11:30
 */
public class $9回文数230324 {


    public boolean isPalindrome(int x) {
        String xStr = String.valueOf(x);
        char[] xCharArray = xStr.toCharArray();

        int l = 0;
        int r = xCharArray.length - 1;

        while (l < r) {
            if (xCharArray[l] == xCharArray[r]) {
                l++;
                r--;
            } else {
                return false;
            }
        }

        return true;
    }

}
