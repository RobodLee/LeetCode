package com.robod.leetcode.binary_search;

/**
 * @author Robod
 * @date 2020/8/6 8:56
 * 排列硬币
 */
public class $441_arrangeCoins {

    public int arrangeCoins(int n) {
        int left = 1;
        int right = n;
        long middle=0;
        long sum;
        while (left <= right) {
            middle = left + (right - left) / 2;
            sum = middle * (middle + 1) / 2;
            if (sum == n) {
                return (int) middle;
            }
            if (sum < n) left = (int) middle + 1;
            if (sum > n) right = (int) middle - 1;
        }
        return right;
    }

    public static void main(String[] args) {
        System.out.println(new $441_arrangeCoins().arrangeCoins(5));
    }

}
