package com.robod.leetcode.math;

/**
 * @author Robod
 * @date 2020/8/9 21:07
 */
public class $400_findNthDigit {

    public int findNthDigit(int n) {
        int bit = 0;    //n所在的数字是几位数
        int sum = 0;    //bit-1位数字的和
        while (sum + 9 * Math.pow(10, bit) * (bit + 1) <= n) {
            sum += 9 * Math.pow(10, bit++) * bit;
        }
        n = n - sum;    //
        int remainder = n % ++bit;    //余数
        int count = n / bit + (remainder == 0 ? 0 : 1);   //第几个数
        int num = (int) (Math.pow(10, bit - 1) + count - 1);    //n所在的数

        if (remainder == 0) {
            return num % 10;
        } else {
            return ((int) (num / Math.pow(10, bit - remainder))) % 10;
        }
    }

    public static void main(String[] args) {
        System.out.println(new $400_findNthDigit().findNthDigit(261));
    }

}
