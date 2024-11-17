package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @ClassName $101对称二叉树241117
 * @Description 简单。https://leetcode.cn/problems/symmetric-tree/description/
 * @Author Robod
 * @Date 2024/11/17 23:20
 */
public class $101对称二叉树241117 {

    public boolean isSymmetric(TreeNode root) {
        return check(root, root);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        return (left.val == right.val) && check(left.left, right.right) && check(left.right, right.left);
    }

}
