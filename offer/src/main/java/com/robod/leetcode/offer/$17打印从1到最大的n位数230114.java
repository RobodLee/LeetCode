package com.robod.leetcode.offer;

/**
 * @ClassName $17打印从1到最大的n位数230114
 * @Description 简单。：https://leetcode.cn/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * @Author Robod
 * @Date 2023/1/14 23:04
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $17打印从1到最大的n位数230114 {

    public int[] printNumbers(int n) {
        int max = 0;
        int k = 1;

        // 计算出最大的n位数
        while (n > 0) {
            max += 9 * k;
            k *= 10;
            n--;
        }

        int[] nums = new int[max];
        for (int i = 0; i < max; i++) {
            nums[i] = i + 1;
        }

        return nums;
    }
}
