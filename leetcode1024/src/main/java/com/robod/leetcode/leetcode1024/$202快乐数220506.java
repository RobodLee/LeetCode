package com.robod.leetcode.leetcode1024;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName $202快乐数220506
 * @Description 简单。https://leetcode-cn.com/problems/happy-number/
 * @Author Robod
 * @Date 2022/5/6 22:47
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $202快乐数220506 {

    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {    //求各位平方和
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (!set.add(sum)) {
                return false;   //如果sum的值在set中出现过，说明已经进入到死循环，结束，返回false
            } else {
                if (sum == 1) {
                    return true;    //各位平方和为1返回true
                }
            }
            n = sum;
        }
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
