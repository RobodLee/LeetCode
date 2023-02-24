package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $738单调递增的数字230224
 * @Description 中等，贪心。https://leetcode.cn/problems/monotone-increasing-digits/
 * @Author Robod
 * @Date 2023/2/24 21:56
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $738单调递增的数字230224 {

    public int monotoneIncreasingDigits(int n) {
        char[] chars = Integer.toString(n).toCharArray();

        int flag = chars.length;  // 从flag位开始，后面全部修改为9

        for (int i = chars.length - 1; i > 0; i--) {
            if (chars[i - 1] > chars[i]) {
                flag = i;
                chars[i - 1] = (char) (chars[i - 1] - 1);
            }
        }

        for (int i = flag; i < chars.length; i++) {
            chars[i] = '9';
        }

        return Integer.parseInt(String.valueOf(chars));
    }


}
