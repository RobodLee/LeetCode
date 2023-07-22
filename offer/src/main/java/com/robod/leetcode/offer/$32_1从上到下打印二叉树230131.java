package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @ClassName $32_1从上到下打印二叉树230131
 * @Description 中等。https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-lcof/
 * @Author Robod
 * @Date 2023/1/31 23:17
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $32_1从上到下打印二叉树230131 {

    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        List<Integer> resList = new ArrayList<>();

        while (!queue.isEmpty()) {
            // 1.队首元素出栈
            TreeNode head = queue.poll();
            if (head != null) {
                resList.add(head.val);
            }

            // 2.队首元素左右节点入队
            if (head != null) {
                queue.add(head.left);
                queue.add(head.right);
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

}
