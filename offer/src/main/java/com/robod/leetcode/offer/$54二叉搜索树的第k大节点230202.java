package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $54二叉搜索树的第k大节点230202
 * @Description 简单。https://leetcode.cn/problems/er-cha-sou-suo-shu-de-di-kda-jie-dian-lcof/
 * @Author Robod
 * @Date 2023/2/2 19:52
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $54二叉搜索树的第k大节点230202 {

    private int res;
    private int kk;

    public int kthLargest(TreeNode root, int k) {
        kk = k;

        dfs(root);
        return res;
    }

    /**
     * 二叉搜索树中序遍历倒序的结果是单调递减的
     */
    private void dfs(TreeNode node) {
        if (node == null) {
            return;
        }
        dfs(node.right);

        if (--kk == 0) {
            res = node.val;
            return;
        }

        dfs(node.left);

    }

}
