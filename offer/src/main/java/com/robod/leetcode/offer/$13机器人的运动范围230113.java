package com.robod.leetcode.offer;

/**
 * @ClassName $13机器人的运动范围230113
 * @Description 中等:https://leetcode.cn/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 * @Author Robod
 * @Date 2023/1/13 11:35
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $13机器人的运动范围230113 {

    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];

        return dfs(0, 0);
    }

    private int dfs(int i, int j) {
        if (i < 0 || i >= m || j < 0 || j >= n || visited[i][j] || rowAndColSum(i, j) > k) {
            return 0;
        }

        visited[i][j] = true;

        return 1 + dfs(i + 1, j) + dfs(i, j + 1);
    }

    private int rowAndColSum(int m, int n) {
        int sum = 0;
        while (m != 0) {
            sum += m % 10;
            m = m / 10;
        }

        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }

        return sum;
    }

}
