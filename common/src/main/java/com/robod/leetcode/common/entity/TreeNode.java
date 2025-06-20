package com.robod.leetcode.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName TreeNode
 * @Description TODO
 * @Author Robod
 * @Date 2023/1/15 19:25
 * @Version 1.0
 * @Github https://github.com/RobodLee/DayDayUP
 * @Copyright 微信公众号：Robod | 好好学习，天天向上！
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TreeNode {

    public int val;

    public TreeNode left;

    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static TreeNode buildTree(Integer[] arr) {
        if (arr == null || arr.length == 0 || arr[0] == null) {
            return null;
        }

        // 创建根节点
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int index = 1; // 从数组第二个元素开始处理
        while (!queue.isEmpty() && index < arr.length) {
            TreeNode current = queue.poll();

            // 处理左子节点
            if (index < arr.length && arr[index] != null) {
                current.left = new TreeNode(arr[index]);
                queue.offer(current.left);
            }
            index++;

            // 处理右子节点
            if (index < arr.length && arr[index] != null) {
                current.right = new TreeNode(arr[index]);
                queue.offer(current.right);
            }
            index++;
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] arr = {3, 5, 1, 6, 2, 0, 8, null, null, 7, 4};
        TreeNode root = buildTree(arr);
        System.out.println("构建完成，根节点值为: " + root.val); // 输出根节点验证
    }

}
