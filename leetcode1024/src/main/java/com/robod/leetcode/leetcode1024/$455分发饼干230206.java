package com.robod.leetcode.leetcode1024;

import java.util.Arrays;

/**
 * @ClassName $455分发饼干230206
 * @Description 简单，贪心。https://leetcode.cn/problems/assign-cookies/
 * @Author Robod
 * @Date 2023/2/6 12:57
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $455分发饼干230206 {

    /**
     * g胃口值，s饼干
     */
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;
        int index = s.length - 1;

        // 大饼干喂给胃口大的
        for (int i = g.length - 1; i >= 0; i--) {
            if (index >= 0 && s[index] >= g[i]) {
                result++;
                index--;
            }
        }

        return result;
    }

}
