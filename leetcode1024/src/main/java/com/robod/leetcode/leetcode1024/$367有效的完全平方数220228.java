package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/2/28 18:46
 * @description 给定一个 正整数 num ，编写一个函数，如果 num 是一个完全平方数，则返回 true ，否则返回 false 。
 *
 * 进阶：不要 使用任何内置的库函数，如 sqrt 。
 *
 * 简单
 * 二分
 */
public class $367有效的完全平方数220228 {

    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        long middle;
        long result;
        while (left <= right) {
            middle = (left + right) / 2;
            result = middle * middle;
            if (result == num) {
                return true;
            }
            if (result < num) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        boolean result = new $367有效的完全平方数220228().isPerfectSquare(17);
        System.out.println(result);
    }
}
