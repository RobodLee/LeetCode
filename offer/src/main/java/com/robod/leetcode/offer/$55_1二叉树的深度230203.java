package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $55_1二叉树的深度230203
 * @Description 简单。https://leetcode.cn/problems/er-cha-shu-de-shen-du-lcof/
 * @Author Robod
 * @Date 2023/2/3 16:44
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $55_1二叉树的深度230203 {

    private int dep = 1;

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        dfs(root.left, 2);
        dfs(root.right, 2);

        return dep;
    }

    private void dfs(TreeNode node, int nowDep) {
        if (node == null) {
            return;
        }
        dep = Math.max(nowDep, dep);

        dfs(node.left, nowDep + 1);
        dfs(node.right, nowDep + 1);
    }

}
