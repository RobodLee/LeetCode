package com.robod.leetcode.leetcode1024;

import java.util.Arrays;

/**
 * @ClassName $452用最少数量的箭引爆气球230220
 * @Description 中等，贪心。https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons/
 * @Author Robod
 * @Date 2023/2/20 20:45
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $452用最少数量的箭引爆气球230220 {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        Arrays.sort(points, (point1, point2) -> Integer.compare(point1[1], point2[1]));

        int arrow = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > points[i - 1][1]) {
                // 右边界不重叠，需要一根新弓箭
                arrow++;
            } else {
                // 更新右边界，相当于下一轮射箭只考虑i和i+1，已经包含了i-1。
                points[i][1] = Math.min(points[i][1], points[i - 1][1]);
            }
        }

        return arrow;
    }

    public static void main(String[] args) {
//        int[][] arr = new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int[][] arr = new int[][]{{-2147483646, -2147483645}, {2147483646, 2147483647}};
        new $452用最少数量的箭引爆气球230220().findMinArrowShots(arr);
    }

}
