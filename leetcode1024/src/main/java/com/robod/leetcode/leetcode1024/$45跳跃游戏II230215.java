package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $45跳跃游戏II230215
 * @Description 中等，模拟跳跃。https://leetcode.cn/problems/jump-game-ii/
 * @Author Robod
 * @Date 2023/2/15 00:58
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $45跳跃游戏II230215 {

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }
        int step = 0;

        int curIndex = 0;
        while (curIndex != nums.length - 1) {
            if (curIndex + nums[curIndex] >= nums.length - 1) {
                // 在当前位置可以跳到最后一格
                return step + 1;
            }

            int nextMax = curIndex;
            int nextIndex = curIndex;
            for (int j = curIndex + 1; j <= curIndex + nums[curIndex] && j < nums.length; j++) {
                // 在[curIndex+1,curIndex+nums[curIndex]]这个范围内，跳到哪一格能使下一次跳跃跳的最远
                if (j + nums[j] > nextMax) {
                    nextMax = j + nums[j];
                    nextIndex = j;
                }
            }

            // 跳到nextIndex处
            curIndex = nextIndex;
            step++;
        }

        return step;
    }

}
