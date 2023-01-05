package com.robod.leetcode.leetcode1024;

/**
 * @author Robod
 * @date 2022/2/28 17:27
 * @description 给你一个非负整数 x ，计算并返回 x 的 算术平方根 。
 * <p>
 * 由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。
 * <p>
 * 二分法
 */
public class $69x的平方根220228 {

    private int mySqrt(int x) {
        long left = 1;
        long right = x;
        long middle;
        long num;
        while (left <= right) {
            middle = (left + right) / 2;
            num = middle * middle;
            if (num == x) {
                return (int) middle;
            } else if (num > x) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return (int) right;
    }

    public static void main(String[] args) {
        int x = 2147483647;
        int result = new $69x的平方根220228().mySqrt(x);
        System.out.println(result);
    }

}
