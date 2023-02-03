package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $55_2平衡二叉树230203
 * @Description 简单。https://leetcode.cn/problems/ping-heng-er-cha-shu-lcof/
 * @Author Robod
 * @Date 2023/2/3 17:17
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $55_2平衡二叉树230203 {

    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    /**
     * 自底向上累加深度，发现左右子树高度差超过1，返回-1
     */
    private int recur(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int left = recur(node.left);
        if (left == -1) {
            return -1;
        }

        int right = recur(node.right);
        if (right == -1) {
            return -1;
        }

        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}
