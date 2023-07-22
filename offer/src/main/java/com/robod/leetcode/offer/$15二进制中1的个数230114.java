package com.robod.leetcode.offer;

/**
 * @ClassName $15二进制中1的个数230114
 * @Description 简单:https://leetcode.cn/problems/er-jin-zhi-zhong-1de-ge-shu-lcof/
 * @Author Robod
 * @Date 2023/1/14 00:34
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $15二进制中1的个数230114 {

    public int hammingWeight(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                sum++;
            }
        }
        return sum;
    }

}
