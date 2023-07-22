package com.robod.leetcode.offer;

/**
 * @ClassName $_2_006排序数组中两个数字之和230127
 * @Description 简单。双指针法：https://leetcode.cn/problems/kLl5u1/
 * @Author Robod
 * @Date 2023/1/27 11:59
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $_2_006排序数组中两个数字之和230127 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }

        int[] res = new int[2];
        res[0] = left;
        res[1] = right;
        return res;
    }


}
