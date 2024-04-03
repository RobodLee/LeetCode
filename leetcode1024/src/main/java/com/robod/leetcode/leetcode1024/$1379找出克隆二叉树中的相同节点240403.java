package com.robod.leetcode.leetcode1024;

import com.robod.leetcode.common.entity.TreeNode;

/**
 * @Description 二叉树遍历、递归
 * @Degree 简单
 * @Link :https://leetcode.cn/problems/find-a-corresponding-node-of-a-binary-tree-in-a-clone-of-that-tree
 * @Author Robod
 * @Date 2024/4/3 22:42
 */
public class $1379找出克隆二叉树中的相同节点240403 {

    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        if (original == null) {
            return null;
        }

        if (original == target) {
            return cloned;
        }

        TreeNode left = getTargetCopy(original.left, cloned.left, target);
        return left != null ? left : getTargetCopy(original.right, cloned.right, target);
    }

}
