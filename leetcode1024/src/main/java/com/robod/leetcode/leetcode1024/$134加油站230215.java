package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $134加油站230215
 * @Description 中等。https://leetcode.cn/problems/gas-station/
 * @Author Robod
 * @Date 2023/2/15 20:03
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $134加油站230215 {

    /**
     * 暴力解法,时间复杂度是O(n²)，测试用例都通过了，但显示超过时间限制
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        for (int i = 0; i < gas.length; i++) {
            int carGas = gas[i] - cost[i];
            int j = (i + 1) % gas.length;
            while (j != i && carGas > 0) {
                carGas += gas[j] - cost[j];
                j = (j + 1) % gas.length;
            }
            if (j == i && carGas >= 0) {
                return i;
            }
        }

        return -1;
    }

}
