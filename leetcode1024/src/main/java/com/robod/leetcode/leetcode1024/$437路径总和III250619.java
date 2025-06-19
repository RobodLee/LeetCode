package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * https://leetcode.cn/problems/path-sum-iii
 */
public class $437路径总和III250619 {

    /**
     * 从root开始作为起点，一直往下累加
     */
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int result = 0;
        result += recursion(root, 0, targetSum);

        // 分别以左右节点作为起点，往下找
        result += pathSum(root.left, targetSum);
        result += pathSum(root.right, targetSum);

        return result;
    }

    private int recursion(TreeNode node, long nowSum, int targetSum) {
        if (node == null) {
            return 0;
        }

        int result = 0;

        nowSum += node.val;
        if (nowSum == (long) targetSum) {
            result++;
        }

        // 还未到目标值，继续分别向左右走
        result += recursion(node.left, nowSum, targetSum);
        result += recursion(node.right, nowSum, targetSum);

        return result;
    }

}
