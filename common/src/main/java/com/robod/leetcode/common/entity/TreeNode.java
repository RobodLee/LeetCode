package com.robod.leetcode.common.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author Robod
 * @Date 2023/1/15 19:25
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }

}
