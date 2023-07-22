package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $28对称的二叉树230115
 * @Description 简单：https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/
 * @Author Robod
 * @Date 2023/1/15 20:03
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $28对称的二叉树230115 {

    public boolean isSymmetric(TreeNode root) {
        if(root == null) {
            return true;
        }

        return isMirror(root.left,root.right);
    }

    private boolean isMirror(TreeNode l,TreeNode r) {
        if(l == null && r == null) {
            return true;
        }

        if(l == null || r == null) {
            return false;
        }

        if(l.val != r.val) {
            return false;
        }

        return isMirror(l.left,r.right) && isMirror(l.right,r.left);
    }
}
