package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName $34二叉树中和为某一值的路径230202
 * @Description 中等。https://leetcode.cn/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 * @Author Robod
 * @Date 2023/2/2 15:05
 * @Version 1.0
 * @github <a href="https://github.com/RobodLee/DayDayUP"/>
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $34二叉树中和为某一值的路径230202 {

    private LinkedList<List<Integer>> res;
    private LinkedList<Integer> path;

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        res = new LinkedList<>();
        path = new LinkedList<>();

        recur(root, target);

        return res;
    }

    private void recur(TreeNode node, int val) {
        if (node == null) {
            return;
        }

        path.add(node.val);
        val -= node.val;

        // node是叶子节点，而且路径和为target，加入到res中。
        if (val == 0 && node.left == null && node.right == null) {
            res.add(new ArrayList(path));
        }

        recur(node.left, val);
        recur(node.right, val);

        path.removeLast();
    }

}
