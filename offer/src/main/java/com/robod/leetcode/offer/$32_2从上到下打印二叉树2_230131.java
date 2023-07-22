package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName $32_2从上到下打印二叉树2_230131
 * @Description 中等。https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-ii-lcof/
 * @Author Robod
 * @Date 2023/1/31 23:21
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $32_2从上到下打印二叉树2_230131 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int curSize = queue.size();

            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < curSize; i++) {
                TreeNode head = queue.poll();
                if (head != null) {
                    temp.add(head.val);
                    if (head.left != null) {
                        queue.add(head.left);
                    }
                    if (head.right != null) {
                        queue.add(head.right);
                    }
                }
            }
            res.add(temp);
        }

        return res;
    }

}
