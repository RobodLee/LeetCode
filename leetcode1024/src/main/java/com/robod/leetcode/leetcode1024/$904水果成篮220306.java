package com.robod.leetcode.leetcode1024;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName $904水果成篮220306
 * @Description 中等。https://leetcode-cn.com/problems/fruit-into-baskets
 * @Author Robod
 * @Date 2022/3/6
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $904水果成篮220306 {

    private int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>(2);
        int result = 0;
        for (int left = 0, right = 0; right < fruits.length; right++) {
            //当前篮子有该水果类型，直接放入
            if (basket.containsKey(fruits[right])) {
                basket.put(fruits[right], basket.get(fruits[right]) + 1);
                result = Integer.max(result, right - left + 1);
            } else if (basket.size() < 2) {     //当前篮子中无该水果类型，但有空篮子
                basket.put(fruits[right], 1);
                result = Integer.max(result, right - left + 1);
            } else {    //当前篮子不符合水果类型，向右移动窗口的left，使其丢掉一个篮子中的水果，然后将right的水果放入篮子
                while (basket.size() == 2) {
                    basket.put(fruits[left], basket.get(fruits[left]) - 1);
                    if (basket.get(fruits[left]) == 0) {
                        basket.remove(fruits[left]);
                    }
                    left++;
                }
                basket.put(fruits[right], 1);
                result = Integer.max(result, right - left + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] fruits = new int[]{1,2,3,2,2};
        System.out.println(new $904水果成篮220306().totalFruit(fruits));
    }
}
