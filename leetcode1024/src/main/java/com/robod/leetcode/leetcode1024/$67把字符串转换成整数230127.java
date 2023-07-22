package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $67把字符串转换成整数230127
 * @Description 中等。https://leetcode.cn/problems/ba-zi-fu-chuan-zhuan-huan-cheng-zheng-shu-lcof/submissions/
 * @Author Robod
 * @Date 2023/1/27 19:43
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $67把字符串转换成整数230127 {

    public int strToInt(String str) {
        // 去除前后空格
        str = str.trim();

        int i = 1;
        int sign = 1; // 符号标记
        if (str.length() > 0 && str.charAt(0) == '-') {
            // 第一位是负号，将符号标记置为-1。
            sign = -1;
        } else if (str.length() > 0 && str.charAt(0) != '+') {
            // 只要第一位不是负号也不是正号就视作正数，从第一位开始算。如果是正号，则从第2位开始计算
            i--;
        }

        int res = 0;
        for (; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                // 如果第一位是字母，这里break后，res * sign 的结果就是0，不用对第一位是否是字母单独判断
                break;
            }

            int curNum = str.charAt(i) - '0';
            int temp = res * 10 + curNum;
            // 除以10与原来的数不等，说明溢出了。不要写成(temp - curNum) / 10 != res可能会出错，temp / 10本身就已经将curNum舍去了
            if (temp / 10 != res) {
                System.out.println();
                return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }
            res = temp;
        }

        return res * sign;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(new $67把字符串转换成整数230127().strToInt("2147483648"));
    }

}
