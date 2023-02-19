package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $860柠檬水找零230219
 * @Description 简单，贪心。https://leetcode.cn/problems/lemonade-change/
 * @Author Robod
 * @Date 2023/2/19 14:43
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $860柠檬水找零230219 {

    public boolean lemonadeChange(int[] bills) {
        Map<Integer, Integer> map = new HashMap<>(); // 每种钱币的数量
        map.put(5, 0);
        map.put(10, 0);
        map.put(20, 0);

        for (int bill : bills) {
            if (bill == 5) {
                // 5元，直接收进钱包
                map.put(5, map.get(5) + 1);
            } else if (bill == 10) {
                // 10元，找一张5元
                if (map.get(5) <= 0) {
                    return false;
                } else {
                    map.put(10, map.get(10) + 1);
                    map.put(5, map.get(5) - 1);
                }
            } else if (bill == 20) {
                // 20元，找一张10元一张5元，或者找3张5元
                map.put(20, map.get(20) + 1);
                if (map.get(10) > 0 && map.get(5) > 0) {
                    map.put(5, map.get(5) - 1);
                    map.put(10, map.get(10) - 1);
                } else if (map.get(5) >= 3) {
                    map.put(5, map.get(5) - 3);
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
