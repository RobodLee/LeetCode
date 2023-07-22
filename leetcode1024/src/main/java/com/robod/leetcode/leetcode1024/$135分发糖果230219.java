package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $135分发糖果230219
 * @Description 困难，贪心。https://leetcode.cn/problems/candy/
 * @Author Robod
 * @Date 2023/2/19 13:46
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $135分发糖果230219 {

    /**
     * 两个维度的问题，不要同时考虑两个维度，一次考虑一个维度。
     */
    public int candy(int[] ratings) {
        int[] candyToChildren = new int[ratings.length];
        candyToChildren[0] = 1;

        // 1.第一遍遍历，从前向后遍历。处理右孩子比左孩子得分高的情况
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i - 1] < ratings[i]) {
                candyToChildren[i] = candyToChildren[i - 1] + 1;
            } else {
                candyToChildren[i] = 1;
            }
        }

        int candySum = candyToChildren[ratings.length - 1];
        // 2.第二遍遍历，从后往前遍历。处理左孩子得分大于右孩子的情况
        for (int i = ratings.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candyToChildren[i] = Math.max(candyToChildren[i + 1] + 1, candyToChildren[i]);
            }
            candySum += candyToChildren[i];
        }

        return candySum;
    }

}
