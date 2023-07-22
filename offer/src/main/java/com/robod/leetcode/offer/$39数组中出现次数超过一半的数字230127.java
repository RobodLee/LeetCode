package com.robod.leetcode.offer;

/**
 * @ClassName $39数组中出现次数超过一半的数字230127
 * @Description 简单。https://leetcode.cn/problems/shu-zu-zhong-chu-xian-ci-shu-chao-guo-yi-ban-de-shu-zi-lcof/
 * @Author Robod
 * @Date 2023/1/27 17:50
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $39数组中出现次数超过一半的数字230127 {

    /**
     * 投票法
     */
    public int majorityElement(int[] nums) {
        int index = 0;  // 结果数所在的起始下标
        int sum = 1;    // 计数和

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                sum--;
            } else if (nums[i] == nums[index]) {
                sum++;
            }

            // 计数和等于0表示前n个数相互抵消。从i+1重新开始
            if (sum == 0) {
                index = i + 1;
                sum = 1;
                i++;
            }
        }

        return nums[index];
    }
}
