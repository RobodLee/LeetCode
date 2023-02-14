package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $122买卖股票的最佳时机II230214
 * @Description 中等，贪心。https://leetcode.cn/problems/best-time-to-buy-and-sell-stock-ii/
 * @Author Robod
 * @Date 2023/2/14 23:32
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $122买卖股票的最佳时机II230214 {

    public int maxProfit(int[] prices) {
        int money = 0;  //空手套白狼，最后剩的钱就是纯利润
        boolean hasStock = false;   // 手头上是否有股票

        for (int i = 0; i < prices.length - 1; i++) {
            if (!hasStock && (prices[i + 1] - prices[i]) > 0) {
                // 情况1: 没股票，第二天会涨，买入
                hasStock = true;
                money -= prices[i];
            } else if (hasStock && (prices[i + 1] - prices[i]) < 0) {
                // 情况2: 有股票，第二天会跌，卖出
                money += prices[i];
                hasStock = false;
            }
        }

        // 最后一天，手上要是有股票就卖了
        if (hasStock) {
            money += prices[prices.length - 1];
        }

        return money;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        System.out.println(new $122买卖股票的最佳时机II230214().maxProfit(prices));
    }

}
