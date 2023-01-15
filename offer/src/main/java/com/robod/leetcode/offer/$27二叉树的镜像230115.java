package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $27二叉树的镜像
 * @Description 简单：https://leetcode.cn/problems/er-cha-shu-de-jing-xiang-lcof/submissions/
 * @Author Robod
 * @Date 2023/1/15 18:54
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $27二叉树的镜像230115 {

    public TreeNode mirrorTree(TreeNode root) {
        exchange(root);
        return root;
    }

    private void exchange(TreeNode root) {
        if(root == null) {
            return;
        }

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        exchange(root.left);
        exchange(root.right);
    }

}
