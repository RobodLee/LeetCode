package com.robod.leetcode.leetcode1024;

/**
 * @ClassName $55跳跃游戏230215
 * @Description 中等，贪心。https://leetcode.cn/problems/jump-game/
 * @Author Robod
 * @Date 2023/2/15 00:13
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $55跳跃游戏230215 {

    /**
     * 换个思路，考虑覆盖范围，如果能够把最后一个数覆盖到则说明可以跳到最后一步。不用真的模拟跳跃。
     */
    public boolean canJump(int[] nums) {
        int cover = 0;

        for (int i = 0; i < nums.length && cover >= i; i++) {
            cover = Math.max(cover, i + nums[i]);
        }

        return cover >= nums.length - 1;
    }

}
