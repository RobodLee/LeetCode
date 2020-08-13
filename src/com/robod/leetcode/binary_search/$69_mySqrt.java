package com.robod.leetcode.binary_search;

/**
 * @author Robod
 * @date 2020/8/12 10:04
 * x 的平方根
 */
public class $69_mySqrt {

    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        long middle;
        long num = 0;
        while (left <= right) {
            middle = left + (right-left)/2;
            num = middle*middle;
            if (num == x) return (int) middle;
            else if(num > x) right = (int) (middle-1);
            else left = (int) (middle+1);
        }
        return right;
    }

    public static void main(String[] args) {
    }

}
