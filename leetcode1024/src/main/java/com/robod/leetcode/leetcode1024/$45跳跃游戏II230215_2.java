package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $45跳跃游戏II230215_2
 * @Description 中等，贪心。https://leetcode.cn/problems/jump-game-ii/
 * @Author Robod
 * @Date 2023/2/15 01:48
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $45跳跃游戏II230215_2 {

    public int jump(int[] nums) {
        if (nums.length <= 1) {
            return 0;
        }

        int curCover = 0;   // 当前覆盖范围
        int nextCover = 0;  // 在当前覆盖范围内，下一步的覆盖范围
        int step = 0;

        for (int i = 0; i < nums.length; i++) {
            nextCover = Math.max(i + nums[i], nextCover);

            if (i == curCover) {
                // 到达当前覆盖范围的最后一格时，如果没有到达终点，则跳一步
                if (i != nums.length - 1) {
                    step++;
                    curCover = nextCover;
                }
            }
        }

        return step;
    }

}
