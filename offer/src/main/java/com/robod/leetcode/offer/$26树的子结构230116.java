package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $26树的子结构230116
 * @Description 中等：https://leetcode.cn/problems/shu-de-zi-jie-gou-lcof/
 * @Author Robod
 * @Date 2023/1/16 23:38
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $26树的子结构230116 {

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 空树不是任何一棵树的子结构
        if (A == null || B == null) {
            return false;
        }

        if (isSubTree(A, B)) {
            return true;
        }

        // 递归判断B是否是A左子树的子结构 或 A右子树的子结构
        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    /**
     * 判断b是否是a的子结构
     **/
    private boolean isSubTree(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        }

        if (a == null || a.val != b.val) {
            return false;
        }

        return isSubTree(a.left, b.left) && isSubTree(a.right, b.right);
    }

}
