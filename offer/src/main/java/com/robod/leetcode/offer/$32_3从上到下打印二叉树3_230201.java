package com.robod.leetcode.offer;

import com.robod.leetcode.common.entity.TreeNode;

import java.util.*;

/**
 * @ClassName $32_3从上到下打印二叉树3_230201
 * @Description 中等。https://leetcode.cn/problems/cong-shang-dao-xia-da-yin-er-cha-shu-iii-lcof/
 * @Author Robod
 * @Date 2023/2/1 00:37
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
public class $32_3从上到下打印二叉树3_230201 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);

        boolean l_to_r = true;

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

            if(!l_to_r) {
                Collections.reverse(temp);
            }
            res.add(temp);
            l_to_r = !l_to_r;

        }

        return res;
    }

}
